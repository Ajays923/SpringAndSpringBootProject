package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.PersonMgmtServiceImpl;

@Component
public class AssociationTestRunner implements CommandLineRunner {
	@Autowired
	private PersonMgmtServiceImpl service;

	@Override
	public void run(String... args) throws Exception {
		service.fetchDataByJoinsUsingParent().forEach(row->{
			for(Object val:row) {
				System.out.print(val+" ");
			}
			System.out.println();
		});
	}//run
}// class
