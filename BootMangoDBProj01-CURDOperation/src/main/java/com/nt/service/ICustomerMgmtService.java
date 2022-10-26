package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.nt.document.Customer;

public interface ICustomerMgmtService {
		public String registerCustomer(Customer cust);
		public List<Customer> findAllCustomers();
		public String removeCustomers(String id);
		public List<Customer> findAllByOrderByIdAsc(Sort sort);
}
