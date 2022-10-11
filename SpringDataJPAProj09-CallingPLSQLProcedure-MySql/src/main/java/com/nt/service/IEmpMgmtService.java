package com.nt.service;

import java.util.List;

import com.nt.entity.Emp;

public interface IEmpMgmtService {
		public List<Emp> searchEmpsByDesg(String desg1,String desg2);
		
}
