package com.nt.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PersonDetails;
import com.nt.service.IPersonDetailsMgmtService;

@Component
public class TestPersonDetails implements CommandLineRunner {
	@Autowired
	private IPersonDetailsMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*// prepare document object
		PersonDetails details = new PersonDetails();
		details.setPid(new Random().nextInt(10000));
		details.setPname("Ajay");
		details.setPaddrs("Aurangabad");
		details.setNickNames(new String[]{"Aju","Aj"});
		details.setMaritalStatus(false);
		details.setMobileNumbers(Set.of(8793819223L,9285567586L));
		details.setDob(LocalDateTime.of(1994, 8,10,15, 34));
		details.setAcademics(List.of("10th","12th","Diploma","BE","ME"));
		details.setBankAccounts(Map.of("Sbi",85659586485L,"HDFC",75856958565L));
		Properties pros = new Properties();
		pros.put("adhar", "85956585645");
		pros.put("panNo","GHTPS5992D");
		details.setIdDetails(pros);
		System.out.println(service.registerPerson(details));
		*/
		service.fetchAllPerson().forEach(System.out::println);
	}

}
