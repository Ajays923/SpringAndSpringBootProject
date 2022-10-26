package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Person;
import com.nt.repository.IDrivingLicense;
import com.nt.repository.IPersonRepo;

@Service("personService")
public class RtoMgmtServiceImpl implements IRtoMgmtService {
	@Autowired
	private IPersonRepo perRepo;
	@Autowired
	private IDrivingLicense drivingRepo;
	
	@Override
	public String savePersonWithLicense(Person person) {
		Person per = perRepo.save(person);
		int idVal = per.getPid();
		return "Person details saved with Id value : "+idVal;
		//return "Person details saved with Id value : "+perRepo.save(person).getPid();
	}
	@Override
	public List<Person> fetchAllPersons() {
		return perRepo.findAll();
	}
}
