package com.nt.repo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long>{
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE COMAPNY=?
	public List<CoronaVaccine> findByCompany(String company);
	
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE price<?
	public List<CoronaVaccine> findByPriceLessThan(double price);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE PRICE BETWEEN ? AND ?
	public List<CoronaVaccine> findByPriceBetween(double startPrice,double endPrice);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE NAME LIKE 'M%'
	public List<CoronaVaccine> findByNameLike(String initChars);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE NAME LIKE 'M%'
	public List<CoronaVaccine> findByNameStartingWith(String startLetters);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE NAME LIKE '%p'
	public List<CoronaVaccine> findByNameEndingWith(String endLetters);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE NAME LIKE '%ut%'
	public List<CoronaVaccine> findByNameContaining(String letters);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE COUNTRY IN ("USA","RUSIA")
	public List<CoronaVaccine> findByCountryIn(List<String> countries);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE COUNTRY NOT IN ("CHINA","PAKISTAN")
	public List<CoronaVaccine> findByCountryNotIn(List<String> countries);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
		// FROM CORONA_VACCINE WHERE PRICE > 500 ORDER BY PRICE ASC
	public List<CoronaVaccine> findByPriceGreaterThanOrderByPriceAsc(double startPrice);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE COUNTRY <> 'CHINA'
	public List<CoronaVaccine> findByCountryIsNot(String country);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
		// FROM CORONA_VACCINE WHERE REGNO=?
	public Optional<CoronaVaccine> findByRegNo(Long RegNo);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
		// FROM CORONA_VACCINE WHERE NAME=? AND COUNTRY=?
	public List<CoronaVaccine> findByNameEqualsAndCountryEquals(String Name,String Country);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
		// FROM CORONA_VACCINE WHERE NAME LIKE 'P%' OR PRICE BETWEEN 500 AND 1500.0
	public List<CoronaVaccine> findByNameLikeOrPriceBetween(String initChars,double startPrice,double endPrice);
	// SELECT REG_NO,NAME,COMPANY,PRICE,COUNTRY,REQUIRED_DOSE_COUNT
	// FROM CORONA_VACCINE WHERE COUNTRY IN("USA","RUSIA") AND PRICE 1000.0 AND 3000.0
	public List<CoronaVaccine> findByCountryInAndPriceBetween(Collection<String> countries,double startPrice,double endPrice);
	
	public List<CoronaVaccine> findByCountryInAndNameInOrPriceGreaterThanEqual(Collection<String> countries,Collection<String> Names,double price);
}
