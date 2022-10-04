package com.nt.service;

import java.util.List;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	
	public List<CoronaVaccine> searchVaccineByCompany(String company);
	public List<CoronaVaccine> searchVaccinesByCompanies(String comp1,String comp2,String comp3);
	public List<Object[]> searchVaccinesDetailsByNames(String name1,String name2);
	public List<String> searchVaccinesNamesByPriceRange(double min,double max);
	
}
