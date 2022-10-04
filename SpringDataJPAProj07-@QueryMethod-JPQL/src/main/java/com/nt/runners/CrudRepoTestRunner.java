package com.nt.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICoronaVaccineMgmtService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;

	@Override
	public void run(String... adrgs) throws Exception {
		//service.searchVaccineByCompany("modern").forEach(System.out::println);
		//service.searchVaccinesByCompanies("pyzar", "Russie", "modern").forEach(System.out::println);
		
		/*service.searchVaccinesDetailsByNames("moderena", "sputuk").forEach(vacc->{
			System.out.println(vacc[0]+" "+vacc[1]+" "+vacc[2]);
		});*/
		
		/*service.searchVaccinesDetailsByNames("moderena", "sputuk").forEach(vacc->{
			Arrays.stream(vacc).forEach(vac->	System.out.print(vac+" "));		
			System.out.println();
		});*/
		
		service.searchVaccinesNamesByPriceRange(1000.0, 3500.0).forEach(System.out::println);
		
	}
}
