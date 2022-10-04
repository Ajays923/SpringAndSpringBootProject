package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;
import com.nt.type.View;

@Service("vaccineMgmtService")
public class CoronaVaccineMgmtServiceImpl implements ICoronaVaccineMgmtService {
	@Autowired
	private ICoronaVaccineRepo coronaRepo;

	@Override
	public List<CoronaVaccine> searchVaccineByCompany(String company) {
		return coronaRepo.searchVaccineByCompany(company);
	}
	@Override
	public List<CoronaVaccine> searchVaccinesByCompanies(String comp1, String comp2, String comp3) {
		return coronaRepo.searchVaccinesByCompanies(comp1, comp2, comp3);
	}
	@Override
	public List<Object[]> searchVaccinesDetailsByNames(String name1, String name2) {
		return coronaRepo.searchVaccinesDetailsByNames(name1, name2);
	}
	@Override
	public List<String> searchVaccinesNamesByPriceRange(double min, double max) {
		return coronaRepo.searchVaccineByNamesByPriceRange(min, max);
	}
}
