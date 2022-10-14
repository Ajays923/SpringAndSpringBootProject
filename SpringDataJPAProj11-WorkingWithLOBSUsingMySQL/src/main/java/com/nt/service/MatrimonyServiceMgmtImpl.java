package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeekar;
import com.nt.repository.IMarriageSeekarRepo;

@Service("matrimonyService")
public class MatrimonyServiceMgmtImpl implements IMatrimonyServiceMgmt {
	@Autowired
	private IMarriageSeekarRepo msRepo;
	
	@Override
	public String registerMarriageSeekar(MarriageSeekar seekar) {
		return "Marriege Seekar info is saved with id value: "+msRepo.save(seekar).getId();
	}

}
