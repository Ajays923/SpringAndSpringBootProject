package com.nt.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.PersonMgmtServiceImpl;

@Component
public class AssociationTestRunner implements CommandLineRunner {
	@Autowired
	private PersonMgmtServiceImpl service;

	@Override
	public void run(String... args) throws Exception {
		/*//=========save operation parent to child================
		// prepare obj having associated child objs
		// child objs
		PhoneNumber ph1 = new PhoneNumber(88999686L,"Airtel","office");
		PhoneNumber ph2 = new PhoneNumber(88999687L,"vodafone","residentce");
		// parent obj
		Person per = new Person("Ajay", "Aurangabad");	
		// parent to child
		ph1.setPerson(per);
		ph2.setPerson(per);
		
		Set<PhoneNumber> phonesSet = Set.of(ph1,ph2);
		// child to parent 
		per.setContactDetails(phonesSet);
		// invokes service method
		System.out.println(service.savePerson(per));
		*/
		
		// =========save operation child to parent================
		/*
		 //child objs  
		PhoneNumber ph1=new PhoneNumber(76576757L,"jio","office" );
		 PhoneNumber ph2=new PhoneNumber(66576155L,"vodafone","office" );
		 //parent obj
		  Person per=new Person("karan","hyd");
		   //add parent to childs 
		    ph1.setPerson(per); ph2.setPerson(per);
		    //childs to parent
		    Set<PhoneNumber> phonesSet=Set.of(ph1,ph2);
		  per.setContactDetails(phonesSet);
		  
		  System.out.println(service.savePhoneNumbers(phonesSet));
		*/

		// ================= Load operation parent to child ===============
		/*service.fetchByPerson().forEach(per->{
		   System.out.println("parent:::"+per);
			 Set<PhoneNumber> childs=per.getContactDetails();
			 	childs.forEach(ph->{
			   System.out.println("child ::"+ph);
			 });
		});*/

		// ================= Load operation child to parent ===============
		/*service.fetchByPhoneNumber().forEach(ph->{
			 System.out.println("child::"+ph);
			Person per=ph.getPerson();
			System.out.println("parent:"+per);
		});*/
		
		// ===================Delete operation parent to child============
		//System.out.println(service.deleteByPerson(25));
		//System.out.println(service.deleteAllPhoneNumberOfAPerson(24));
	}
}
