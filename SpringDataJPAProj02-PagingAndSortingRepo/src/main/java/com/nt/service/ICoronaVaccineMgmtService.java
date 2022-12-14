package com.nt.service;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
		public Iterable<CoronaVaccine> fetchDetails(boolean asc,String...properties);
		public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo,int pageSize,boolean asc,String...props);
		public void fetchDetailsbyPagination(int pageSize);
}
