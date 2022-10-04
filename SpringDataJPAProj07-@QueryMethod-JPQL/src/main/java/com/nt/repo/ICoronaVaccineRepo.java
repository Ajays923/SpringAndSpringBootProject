package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long>{
	
		@Query("FROM CoronaVaccine WHERE company=?1")
		public List<CoronaVaccine> searchVaccineByCompany(String vendor);
		
		@Query("FROM CoronaVaccine WHERE 	company IN(:comp1,:comp2,:comp3) ORDER BY company")
		public List<CoronaVaccine> searchVaccinesByCompanies(String comp1,String comp2,String comp3);
		
		@Query("SELECT name,company,price FROM CoronaVaccine WHERE name IN (:name1,:name2)")
		public List<Object[]> searchVaccinesDetailsByNames(String name1,String name2);
		
		@Query("SELECT name FROM CoronaVaccine WHERE price BETWEEN :min AND :max ")
		public List<String> searchVaccineByNamesByPriceRange(double min,double max);
}
