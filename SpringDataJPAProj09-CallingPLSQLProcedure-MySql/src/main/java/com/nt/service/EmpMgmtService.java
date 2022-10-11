package com.nt.service;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Emp;

@Service("vaccineService")
public class EmpMgmtService implements IEmpMgmtService {
	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Emp> searchEmpsByDesg(String desg1, String desg2) {
		// create StoredProcedureQuery object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("GET_EMPDETAILS_BY_DESG", Emp.class);
		// registered parameter
		query.registerStoredProcedureParameter(1,String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class,ParameterMode.IN);
		// set parameter values 
		query.setParameter(1, desg1);
		query.setParameter(2, desg2);
		// call PL/SQL procedure and get result
		List<Emp> listEmps=query.getResultList();
		return listEmps;
	}

}
