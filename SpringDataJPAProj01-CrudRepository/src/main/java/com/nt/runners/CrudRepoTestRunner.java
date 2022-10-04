package com.nt.runners;

import java.util.Arrays;
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
	public void run(String... args) throws Exception {
		// invoke b. method
		/*try {
			// create Entity class obj
			//CoronaVaccine vaccine = new CoronaVaccine("covishield","serum","india", 500.0,2);
			CoronaVaccine vaccine = new CoronaVaccine("covishield","serum", "india",535.00,3);
			// call b.method
			System.out.println(service.registerVaccine(vaccine));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/

		try {
			//CoronaVaccine vaccine = new CoronaVaccine();
			
			// Bulk insertion/batch processing
			/*Iterable<CoronaVaccine> listVaccines = service.registerBatch(List.of(new CoronaVaccine("sputuk","Russie","Rusia", 567.5,2),
																																		 (new CoronaVaccine("pyzar", "pyzar","USA",789.00,2)),
																																		 (new CoronaVaccine("moderena", "modern","USA",3500.00,1))));*/
			
			Iterable<CoronaVaccine> listVaccines = service.registerBatch(Arrays.asList(new CoronaVaccine("sputuk","Russie","Rusia", 1005.5,1),
																																		(new CoronaVaccine("pyzar", "pyzar","USA",698.00,3)),
																																		(new CoronaVaccine("moderena", "modern","USA",2500.00,2))));
			System.out.println("The regNo are");
			listVaccines.forEach(vaccine -> System.out.println(vaccine.getRegNo()));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		/*try {
			System.out.println("Records Count :: " + service.getVaccineCount());
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		try {
			System.out.println("5 regNo vaccine available ? " + service.checkVaccineAvailabilityByRegNo(5));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*try {
		System.out.println("=============================findAll()============================");
		Iterable<CoronaVaccine> itList = service.fetchAllDetails();
		itList.forEach(vaccine -> { // forEach with lambda 
			System.out.println(vaccine);
		});
		
		System.out.println("------------------forEach with Lambda--------------------------");
		service.fetchAllDetails().forEach(vaccine->System.out.println(vaccine)); // improved forEach with Lambda
		System.out.println("------------------forEach with method reference-------------------");
		service.fetchAllDetails().forEach(System.out::println);  // forEach with method reference
		System.out.println("---------------------Using Stream API------------------");
		Arrays.asList(service.fetchAllDetails()).stream().forEach(System.out::println);// using streaming api
		System.out.println("------------------------------------------------");
		Arrays.asList(service.fetchAllDetails()).stream().map(vac1->vac1).forEach(System.out::println);	
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			}
		}*/
		/*try {
			System.out.println("=============================findAllByIds()============================");
			Iterable<CoronaVaccine> itList = service.fetchAllDetailsByIds(List.of(7L,8L,9L));
			itList.forEach(vaccine -> { // forEach with lambda 
				System.out.println(vaccine);
			});
			
			System.out.println("------------------forEach with Lambda--------------------------");
			service.fetchAllDetailsByIds(List.of(7L,8L,9L)).forEach(vaccine->System.out.println(vaccine)); // improved forEach with Lambda
			System.out.println("------------------forEach with method reference-------------------");
			service.fetchAllDetailsByIds(List.of(7L,8L,9L)).forEach(System.out::println);  // forEach with method reference
			System.out.println("---------------------Using Stream API------------------");
			Arrays.asList(service.fetchAllDetailsByIds(List.of(7L,8L,9L))).stream().forEach(System.out::println);// using streaming api
			System.out.println("------------------------------------------------");
			Arrays.asList(service.fetchAllDetailsByIds(List.of(7L,8L,9L))).stream().map(vac1->vac1).forEach(System.out::println);	
			}
			catch(DataAccessException dae) {
				dae.printStackTrace();
				}*/
		/*try {
			System.out.println("================findById()===============");
			Optional<CoronaVaccine> opt= service.fetchVaccineById(12L);
			if(opt.isPresent())
				System.out.println(opt.get());
			else
				System.out.println("Record not found");
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*	try {
				System.out.println("===============findById(-)============");
				Optional<CoronaVaccine> opt=service.fetchVaccineById(5L);
				if(opt.isPresent())
					System.out.println(opt.get());
				opt.orElseThrow(()->new IllegalAccessException("record not found"));
			}
			catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
			
		/*CoronaVaccine vaccine = service.fetchVaccineById(7L).orElseThrow(()-> new IllegalAccessException("not available"));
		System.out.println(vaccine);
		System.out.println("============================");
		CoronaVaccine vaccine1 = service.fetchVaccineById(4L).orElse(new CoronaVaccine());
		System.out.println(vaccine1);
		System.out.println("===========================");
		CoronaVaccine vaccine2=service.fetchVaccineById(2L).orElseGet(()->new CoronaVaccine());
		System.out.println(vaccine2);*/
		
		/*try {
			System.out.println(service.removeVaccineById(5L));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*try {
			CoronaVaccine vaccine = new CoronaVaccine();
			vaccine.setRegNo(6L);
			System.out.println(service.removeVaccineByObject(vaccine));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*try {
			System.out.println(service.removeAllVaccine());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
	}	
}
