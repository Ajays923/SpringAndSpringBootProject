package com.nt.service;

import java.util.Collection;
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
	public String removeVaccineByRegNo(Iterable<Long> regNo) {
		Iterable<CoronaVaccine> listEntities = coronaRepo.findAllById(regNo);
		if(((List)listEntities).size()!=0) {
			coronaRepo.deleteAllByIdInBatch(regNo);
			return ((List)listEntities).size()+" no.of records are deleted";
		}
		return "Record not found";
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByCompany(String company) {
		return coronaRepo.findByCompany(company);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineIsLessThanPrice(double price) {
		return coronaRepo.findByPriceLessThan(price);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineBetweenPrice(double startPrice, double endprice) {
		return coronaRepo.findByPriceBetween(startPrice, endprice);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByName(String initChars) {
		return coronaRepo.findByNameLike(initChars);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByStartingLetter(String startLetters) {
		return coronaRepo.findByNameStartingWith(startLetters);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByEndingLetter(String endLetters) {
		return coronaRepo.findByNameEndingWith(endLetters);
	}
	@Override
	public List<CoronaVaccine> searchVaccineByContainingName(String letters) {
		return coronaRepo.findByNameContaining(letters);
	}
	@Override
	public List<CoronaVaccine> findByCountryIn(List<String> countries) {
		return coronaRepo.findByCountryIn(countries);
	}
	@Override
	public List<CoronaVaccine> fetchByCountryNotIn(List<String> country) {
		return coronaRepo.findByCountryNotIn(country);
	}
	@Override
	public List<CoronaVaccine> fetchByPriceIsGreaterThanOrderByPriceAsc(double startPrice) {
		return coronaRepo.findByPriceGreaterThanOrderByPriceAsc(startPrice);
	}
	@Override
	public List<CoronaVaccine> fetchByCountryIsNot(String country) {
		return coronaRepo.findByCountryIsNot(country);
	}
	@Override
	public Optional<CoronaVaccine> fetchVaccineByRegNo(Long RegNo) {
		return coronaRepo.findByRegNo(RegNo);
	}
	/*@Override
	public List<CoronaVaccine> fetchVaccineByfirstNameOrLastname(String FirstName, String LastName) {
		return coronaRepo.findByLastnameOrFirstname(FirstName, LastName);
	}*/
	
	@Override
	public List<CoronaVaccine> fetchVaccineByNameAndCountry(String Name, String Country) {
		//return coronaRepo.findByNameAndCountry(Name, Country);
		return coronaRepo.findByNameEqualsAndCountryEquals(Name, Country);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByNameOrPriceBetween(String Name, double startPrice, double endPrice) {
		return coronaRepo.findByNameLikeOrPriceBetween(Name, startPrice, endPrice);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByCountryInAndPriceBetween(Collection<String> countries, double startPrice,
			double endPrice) {
		return coronaRepo.findByCountryInAndPriceBetween(countries, startPrice, endPrice);
	}
	@Override
	public List<CoronaVaccine> fetchVaccineByCountryInAndNameInOrPriceGreaterThanEqual(Collection<String> countries,
			Collection<String> names, double price) {
		return coronaRepo.findByCountryInAndNameInOrPriceGreaterThanEqual(countries, names, price);
	}
}
