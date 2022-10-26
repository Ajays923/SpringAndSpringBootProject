package com.nt.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicence;
import com.nt.document.Person;
import com.nt.service.IRtoMgmtService;

@Component
public class AssociationTypeRunnerTest implements CommandLineRunner {
	@Autowired
	private IRtoMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		/* ===========parent to child association===========	
		 * // prepare Association object
		// create parent obj
		Person per = new Person();
		per.setPid(new Random().nextInt(10000));
		per.setPname("Ajay");
		per.setPaddr("Abad");
		
		// create child obj
		DrivingLicence driv = new DrivingLicence();
		driv.setLid(new Random().nextLong(500000));
		driv.setType("Four-wheelar");
		driv.setExpiryDate(LocalDateTime.of(2032, 5,15, 15, 42));
		// map object
		per.setLicense(driv);
		*/
		// =============child to parent association
		// prepare parent obj
		/*				Person per = new Person();
						per.setPid(new Random().nextInt(10000));
						per.setPname("Madhuri");
						per.setPaddr("Mumbai");
						
						// prepare child obj
						DrivingLicence driv = new DrivingLicence();
						driv.setLid(new Random().nextLong(500000));
						driv.setType("Two-wheelar");
						driv.setExpiryDate(LocalDateTime.of(2030, 5,15, 15, 42));
						
						//driv.setPerson(per);
						per.setLicense(driv);
				//execute b.logic
				System.out.println(service.savePersonWithLicense(per));
		
		*/	
		service.fetchAllPersons().forEach(per->{
			DrivingLicence dr = per.getLicense();
			System.out.println(per+""+dr);
		});
	}

}
