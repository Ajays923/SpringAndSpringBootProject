package com.nt.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	
	public List<CoronaVaccine> searchVaccineByCompany(String company);
	public List<CoronaVaccine> searchVaccinesByCompanies(String comp1,String comp2,String comp3);
	public List<Object[]> searchVaccinesDetailsByNames(String name1,String name2);
	public List<String> searchVaccinesNamesByPriceRange(double min,double max);
	public Optional<CoronaVaccine> searchVaccinesByName(String name);
	public Object searchVaccineDataByName(String vname);
	public String searchVaccineCountryByName(String vname);
	public long getVaccinesCount();
	public Object getVaccinesAggregateDataByPriceRange(double min,double max);
	public int updateVaccinePriceByCountry(double newPrice,String country);
	public int removeVaccineByPriceRange(double startPrice,double endPrice);
	//public int insertVaccine(Long RegNo,String Company,String Country,String Name,double Price,int RequiredDoseCount);
	public int insertVaccine(String Company,String Country,String Name,double Price,int RequiredDoseCount);
	public Date SysDate();
	public int CreateTempTable();
	public int dropTable();
}
