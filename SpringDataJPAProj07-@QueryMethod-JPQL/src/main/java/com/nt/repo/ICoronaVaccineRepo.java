package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long>{
	
		@Query("FROM CoronaVaccine WHERE company=?1")
		public List<CoronaVaccine> searchVaccineByCompany(String vendor);
}
