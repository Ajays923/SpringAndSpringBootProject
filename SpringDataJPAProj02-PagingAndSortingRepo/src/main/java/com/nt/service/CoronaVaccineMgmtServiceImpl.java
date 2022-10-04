package com.nt.service;

import java.awt.print.Pageable;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	@Autowired
	private ICoronaVaccineRepo coronaRepo;

	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		Iterable<CoronaVaccine> listEntities =coronaRepo.findAll(sort);
		return listEntities;
	}
	
	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... props) {
		// create Pageable object having inputs
		PageRequest pageable = PageRequest.of(pageNo, 
																										pageSize, 
																										asc?Direction.ASC:Direction.DESC, 
																										props);
		
		Page<CoronaVaccine> page = coronaRepo.findAll(pageable);
		return page.getContent();
	}
	
	@Override
	public void fetchDetailsbyPagination(int pageSize) {
		//get total count records
		long count=coronaRepo.count();
		// decides the pageCount
		long pagesCount =count/pageSize;
		pagesCount = count%pagesCount==0?pagesCount:++pagesCount;
		
		for(int i=0;i<pagesCount;++i) {
				PageRequest pageable = PageRequest.of(i, pageSize);
				Page<CoronaVaccine> page = coronaRepo.findAll(pageable);
				page.getContent().forEach(System.out::println);
				System.out.println("------------"+(i+1)+" of" +page.getTotalPages()+"-------------------");
		}// for
	}// method
}
