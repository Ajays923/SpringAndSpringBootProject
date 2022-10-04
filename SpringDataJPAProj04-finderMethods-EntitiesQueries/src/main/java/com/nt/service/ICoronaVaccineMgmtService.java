package com.nt.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public String removeVaccineByRegNo(Iterable<Long> regNo);
	public List<CoronaVaccine> fetchVaccineByCompany(String company);
	public List<CoronaVaccine> fetchVaccineIsLessThanPrice(double price);
	public List<CoronaVaccine> fetchVaccineBetweenPrice(double startPrice,double endprice);
	public List<CoronaVaccine> fetchVaccineByName(String initChars);
	public List<CoronaVaccine> fetchVaccineByStartingLetter(String startLetters);
	public List<CoronaVaccine> fetchVaccineByEndingLetter(String endLetters);
	public List<CoronaVaccine> searchVaccineByContainingName(String letters);
	public List<CoronaVaccine> findByCountryIn(List<String> countries);
	public List<CoronaVaccine> fetchByCountryNotIn(List<String> country);
	public List<CoronaVaccine> fetchByPriceIsGreaterThanOrderByPriceAsc(double startPrice);
	public List<CoronaVaccine> fetchByCountryIsNot(String country);
	public Optional<CoronaVaccine> fetchVaccineByRegNo(Long RegNo);
	public List<CoronaVaccine> fetchVaccineByNameAndCountry(String Name,String Country);
	public List<CoronaVaccine> fetchVaccineByNameOrPriceBetween(String Name,double startPrice,double endPrice);
	public List<CoronaVaccine> fetchVaccineByCountryInAndPriceBetween(Collection<String> countries,double startPrice,double endPrice);
	public List<CoronaVaccine> fetchVaccineByCountryInAndNameInOrPriceGreaterThanEqual(Collection<String> countries,Collection<String> names,double price);
}
