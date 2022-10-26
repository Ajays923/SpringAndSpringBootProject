package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepo;

@Service("custService")
public class CustomerServiceMgmtImpl implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepo custRepo;
	
	@Override
	public String registerCustomer(Customer cust) {
		return "Customer Saved/updated with Id :: "+custRepo.save(cust).getId();
	}
	/*	@Override
		public String registerCustomer(Customer cust) {
			return "Customer saved with id:: "+custRepo.insert(cust).getId();
		}*/
	
	@Override
	public List<Customer> findAllCustomers() {
		return custRepo.findAll();
	}
	@Override
	public String removeCustomers(String id) {
		// get Document obj by id
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isPresent()) {
			custRepo.deleteById(id);
			return "Document is deleted";
		}
		return "Document not found for deletion";
	}
	@Override
	public List<Customer> findAllByOrderByIdAsc(Sort sort) {
		return custRepo.findAll(sort);
	}
}
