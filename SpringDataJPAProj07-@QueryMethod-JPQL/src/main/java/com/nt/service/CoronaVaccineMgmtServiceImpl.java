package com.nt.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

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
	@Override
	public Optional<CoronaVaccine> searchVaccinesByName(String name) {
		return coronaRepo.searchVaccinesByName(name);
	}
	@Override
	public Object searchVaccineDataByName(String vname) {
		return coronaRepo.searchVaccinesDataByName(vname);
	}
	@Override
	public String searchVaccineCountryByName(String vname) {
		return coronaRepo.searchVaccineCountryByName(vname);
	}
	@Override
	public long getVaccinesCount() {
		return coronaRepo.getVaccinesCount();
	}
	@Override
	public Object getVaccinesAggregateDataByPriceRange(double min, double max) {
		return coronaRepo.getVaccinesDataByPriceRange(min, max);
	}
	@Override
	public int updateVaccinePriceByCountry(double newPrice, String country) {
		return coronaRepo.updatePriceByCountry(newPrice, country);
	}
	@Override
	public int removeVaccineByPriceRange(double startPrice, double endPrice) {
		return coronaRepo.deleteVaccineByPriceRange(startPrice, endPrice);
	}
	
	/*public int insertVaccine(Long RegNo, String Company, String Country, String Name, double Price,
			int RequiredDoseCount) {
		return coronaRepo.insertVaccine(RegNo, Company, Country, Name, Price, RequiredDoseCount);
	}*/
	@Override
	public int insertVaccine(String Company, String Country, String Name, double Price,
			int RequiredDoseCount) {
		return coronaRepo.insertVaccine(Company, Country, Name, Price, RequiredDoseCount);
	}
	@Override
	public Date SysDate() {
		return coronaRepo.SysDate();
	}
	
	@Override
	public int CreateTempTable() {
		return coronaRepo.createTable();
	}
	@Override
	public int dropTable() {
		return coronaRepo.DropTable();
	}
}
