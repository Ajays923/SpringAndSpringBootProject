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
			Iterable<CoronaVaccine> listEntities = service.fetchDetails(true,"price","name");
			listEntities.forEach(System.out::println);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
	
		/*try {
			service.fetchDetailsByPageNo(2, 3, true,"price").forEach(System.out::println);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		try {
			service.fetchDetailsbyPagination(7);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}
}
