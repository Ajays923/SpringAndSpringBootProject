package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine, boolean ascOrder, String... properties) {
		// prepare Example objct
		Example example = Example.of(vaccine);
		Sort sort = Sort.by(ascOrder?Direction.ASC:Direction.DESC, properties);
		List<CoronaVaccine> listEntities = coronaRepo.findAll(example, sort);
		return listEntities;
	}
	@Override
	public CoronaVaccine getVaccineByRegNo(long RegNo) {
		return coronaRepo.getById(RegNo);
	}
}
