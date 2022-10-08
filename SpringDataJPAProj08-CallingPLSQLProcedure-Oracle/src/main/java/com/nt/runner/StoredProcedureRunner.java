package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IVaccineMgmtService;

@Component
public class StoredProcedureRunner implements CommandLineRunner {
	@Autowired
	private IVaccineMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		//service.searchVaccinesByPriceRange(500.0, 3500.0).forEach(System.out::println);
		//System.out.println(" Result are :: "+service.authenticate("ajay","ajay1"));
		Object obj[] = service.getEmpDetailsByEno(7499);
		System.out.println("Emp Name:: "+obj[1]);
		System.out.println("Emp desg :: "+obj[2]);
		System.out.println("Emp salary ::"+obj[3]);
		System.out.println("Emp deptno ::"+obj[0]);
	}

}
