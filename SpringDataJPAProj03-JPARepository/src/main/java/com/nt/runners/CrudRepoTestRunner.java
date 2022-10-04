package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;

	@Override
	public void run(String... adrgs) throws Exception {
		/*try {
			CoronaVaccine vaccine = new CoronaVaccine("sputuk","Russie","Rusia",1005.5,1);
			//CoronaVaccine vaccine = new CoronaVaccine();
			//vaccine.setCompany("Russie");
			//vaccine.setPrice(1005.5);
			service.searchVaccineByGivenData(vaccine, true,"name").forEach(System.out::println);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		try {
			CoronaVaccine vaccine = service.getVaccineByRegNo(4L);
			if(vaccine!=null)
				System.out.println("vaccine details: "+vaccine);
			else
				System.out.println("Record not found");
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}
}
