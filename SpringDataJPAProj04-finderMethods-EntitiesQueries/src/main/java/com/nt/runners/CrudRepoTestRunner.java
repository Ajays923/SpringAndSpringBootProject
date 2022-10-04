package com.nt.runners;

import java.util.List;
import java.util.Optional;

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
		/*try{
			service.removeVaccineByRegNo(List.of(20L,21L));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		//service.fetchVaccineByCompany("Russie").forEach(System.out::println);
		//service.fetchVaccineIsLessThanPrice(2000.0).forEach(System.out::println);
		//service.fetchVaccineBetweenPrice(1000.0,2000.0).forEach(System.out::println);
		//service.fetchVaccineByName("____%").forEach(System.out::println);
		//service.fetchVaccineByStartingLetter("p").forEach(System.out::println);
		//service.fetchVaccineByEndingLetter("k").forEach(System.out::println);
		//service.searchVaccineByContainingName("ut").forEach(System.out::println);
		//service.findByCountryIn(List.of("USA","Rusia")).forEach(System.out::println);
		//service.fetchByCountryNotIn(List.of("PAKISTAN","CHINA")).forEach(System.out::println);	
		//service.fetchByPriceIsGreaterThanOrderByPriceAsc(500.0).forEach(System.out::println);
		//service.fetchByCountryIsNot("CHINA").forEach(System.out::println);
		
		/*Optional<CoronaVaccine> opt = service.fetchVaccineByRegNo(12L);
		if(opt.isPresent()) 
			System.out.println(opt.get());
		else
			System.out.println("Record not found");*/
		
		//service.fetchVaccineByfirstNameOrLastname("moderna","modern").forEach(System.out::println);
		//service.fetchVaccineByNameAndCountry("moderena","USA").forEach(System.out::println);
		//service.fetchVaccineByNameOrPriceBetween("P",500.0,2500.00).forEach(System.out::println);;
		
		//service.fetchVaccineByCountryInAndPriceBetween(List.of("USA","Rusia"),1000.0,3000.0).forEach(System.out::println);
		
		service.fetchVaccineByCountryInAndNameInOrPriceGreaterThanEqual(List.of("USA","RUSIA"),
																																			List.of("MODERENA","SPUTUK"),
																																			1000.0).forEach(System.out::println);
		
	}
}
