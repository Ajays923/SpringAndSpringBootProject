package com.nt.service;

import java.util.List;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine,boolean ascOrder,String...properties);
	public CoronaVaccine getVaccineByRegNo(long RegNo);
}
