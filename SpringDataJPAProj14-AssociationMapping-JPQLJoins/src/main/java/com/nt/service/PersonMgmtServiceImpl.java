package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumber;

@Service("personService")
public class PersonMgmtServiceImpl implements IPersonMgmtService {
	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IPhoneNumber phoneNoRepo;
	
	@Override
	public List<Object[]> fetchDataByJoinsUsingParent() {
		return  personRepo.fetchDataByJoinsUsingParent();
	}
}
