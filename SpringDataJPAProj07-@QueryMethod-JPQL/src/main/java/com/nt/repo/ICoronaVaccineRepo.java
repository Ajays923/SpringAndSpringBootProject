package com.nt.repo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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
		
		@Query("FROM CoronaVaccine WHERE name=:name")
		public Optional<CoronaVaccine> searchVaccinesByName(String name);
		// scalar query giving 	specific multiple col values of single row
		@Query("SELECT name,country FROM CoronaVaccine WHERE name=:vname")
		public Object searchVaccinesDataByName(String vname);
		//Scalary query giving specific single col values
		@Query("SELECT country FROM CoronaVaccine WHERE name=:vname")
		public String searchVaccineCountryByName(String vname);
		
		// ============================Aggregate Function=============
		@Query("SELECT COUNT(*) FROM CoronaVaccine")
		public long getVaccinesCount(); 
		@Query("SELECT COUNT(price),MAX(price),MIN(price),SUM(price),AVG(price) FROM CoronaVaccine WHERE price>=:min AND price<=:max")
		public Object getVaccinesDataByPriceRange(double min,double max);
		
		// ==============================NON-SELECT operations===================

		@Modifying
		@Query("UPDATE CoronaVaccine SET price=:newPrice WHERE country=:country")
		@Transactional
		public int updatePriceByCountry(double newPrice, String country);
		
		@Query("DELETE FROM CoronaVaccine WHERE price BETWEEN :startPrice AND :endPrice")
		@Modifying
		@Transactional
		public int deleteVaccineByPriceRange(double startPrice,double endPrice);
		
		//========================NATIVE SQL QUERIES=============================
		
		//@Query(value="INSERT INTO CORONA_VACCINE VALUES(?,?,?,?,?,?)",nativeQuery = true)
		@Query(value="INSERT INTO CORONA_VACCINE VALUES(VACCINE_REG_NO_SEQ.NEXTVAL,?,?,?,?,?)",nativeQuery = true)
		@Modifying
		@Transactional
		public int insertVaccine(String Company,String Country,String Name, double Price,int RequiredDoseCount);
		
		@Query(value = "SELECT SYSDATE FROM DUAL",nativeQuery = true)
		//@Modifying
		@Transactional
		public Date SysDate();
		
		@Query(value = "CREATE TABLE TEMP2(emp number(5),Name varchar2(20))",nativeQuery = true)
		@Modifying
		@Transactional
		public int createTable();
		
		@Query(value = "DROP TABLE TEMP1",nativeQuery = true)
		@Modifying
		@Transactional
		public int DropTable();
		
		
}
