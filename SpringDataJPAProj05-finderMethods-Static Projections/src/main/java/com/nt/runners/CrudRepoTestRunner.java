package com.nt.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;
import com.nt.type.ResultView;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;

	@Override
	public void run(String... adrgs) throws Exception {
		List<ResultView> listEntities = service.searchVaccineByStartPrice(1000.0);
		listEntities.forEach(vaccine -> {
			System.out.println(vaccine.getName()+"  "+vaccine.getCountry());
		});
	}
}
