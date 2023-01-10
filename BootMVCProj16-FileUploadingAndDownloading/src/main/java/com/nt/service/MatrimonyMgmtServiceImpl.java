package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeekerInfo;
import com.nt.repository.IMarriageSeekarInfoRepo;

@Service("matrimonyService")
public class MatrimonyMgmtServiceImpl implements IMatrimonyMgmtService {
	@Autowired
	private IMarriageSeekarInfoRepo seekerRepo;
	
	@Override
	public String registerProfile(MarriageSeekerInfo entity) {
		return "Profile is register with Profile ID :: "+seekerRepo.save(entity).getProfileId();
	}

}
