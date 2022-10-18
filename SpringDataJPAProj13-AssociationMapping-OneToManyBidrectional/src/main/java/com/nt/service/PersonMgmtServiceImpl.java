package com.nt.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumber;

@Service("servicePerson")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IPhoneNumber phoneNoRepo;
	
	@Override
	public String savePerson(Person person) {
		int idVal=personRepo.save(person).getPid();
		return "Person details save with ID ::"+idVal;
	}
	
	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> phones) {
		for(PhoneNumber ph:phones) {
				phoneNoRepo.save(ph);
		}
		return    ((Set<PhoneNumber>)phones).size()+"no.of PhoneNumberd Saved";
	}
	
	@Override
	public Iterable<Person> fetchByPerson() {
		return personRepo.findAll();
	}
	@Override
	public Iterable<PhoneNumber> fetchByPhoneNumber() {
		return phoneNoRepo.findAll();
	}
	@Override
	public String deleteByPerson(int personId) {
		// Load parent class obj
		Optional<Person> opt = personRepo.findById(personId);
		if(opt.isPresent()) {
			personRepo.delete(opt.get());
			return "Person and his PhoneNumber are deleted";
		}
		return "Person ID is not found";
	}
	
	@Override
	public String deleteAllPhoneNumberOfAPerson(int personId) {
		Optional<Person> opt = personRepo.findById(personId);
		if(opt.isPresent()) {
			  // get all childs of a parent 
			Set<PhoneNumber> childs = opt.get().getContactDetails();
			// deletes all childs
			childs.forEach(val ->{
				val.setPerson(null);
			});
			phoneNoRepo.deleteAll(childs);
			return childs.size()+" PhoneNumber of "+personId+" Person are deleted";
		}
		return personId+" PersonId not found";
	}
}
