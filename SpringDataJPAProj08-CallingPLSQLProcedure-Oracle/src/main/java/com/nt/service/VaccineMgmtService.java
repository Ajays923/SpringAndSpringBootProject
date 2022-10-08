package com.nt.service;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;

@Service("vaccineService")
public class VaccineMgmtService implements IVaccineMgmtService {
	@Autowired
	private EntityManager manager;
	@Override
	public List<CoronaVaccine> searchVaccinesByPriceRange(double min, double max) {
		//create StoredProcedure obj representing PL/SQL procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_VACCINES_BY_PRICERANGE", CoronaVaccine.class);
		// register Parameter of PL/SQL procedure
		query.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3,CoronaVaccine.class,ParameterMode.REF_CURSOR);
		
		// set values to parameters
		query.setParameter(1, min);
		query.setParameter(2, max);
		// call PL/SQL procedure
		List<CoronaVaccine> list=query.getResultList();
		return list;
	}
	
	@Override
	public String authenticate(String user, String pwd) {
		// create Stored Procedured Object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_AUTHENTICATION");
		// register parameters of PL/SQL procedures
		query.registerStoredProcedureParameter(1,String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class,ParameterMode.OUT);
		// set parameter values
		query.setParameter(1,user);
		query.setParameter(2, pwd);
		// call the procedure
		query.execute();
		// gather results out paramter
		String result=(String) query.getOutputParameterValue(3);
		return result;
	}
	
	@Override
	public Object[] getEmpDetailsByEno(int eno) {
		// unwrap Session
		Session ses = manager.unwrap(Session.class);
		// write jdbc to call PL/SQL function
		Object obj[] = ses.doReturningWork(con->{
			// create Callable statement obj
			CallableStatement cs = con.prepareCall("{?=call  FX_GET_EMP_DETAILS(?,?,?,?)}");
			// register return,out paramter
			cs.registerOutParameter(1,Types.INTEGER);// return param (?1)
			cs.registerOutParameter(3,Types.VARCHAR);// return param(?3)
			cs.registerOutParameter(4, Types.VARCHAR);//return param(?4)
			cs.registerOutParameter(5,Types.FLOAT); // return param(?5)
			
			// set value in param
			cs.setInt(2, eno);
			// call PL/SQL function
			cs.execute();
			// gather results from return,out params
			Object objs[]=new Object[4];
			objs[0]=cs.getInt(1);
			objs[1]=cs.getString(3);
			objs[2]=cs.getString(4);
			objs[3]=cs.getFloat(5);
			//objs[4]=cs.getInt(4);
			return objs;
		});
		return obj;
	}

}
