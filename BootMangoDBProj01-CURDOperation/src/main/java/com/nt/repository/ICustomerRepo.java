package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer,String> {
			public List<Customer> findAllByOrderByIdAsc();
}
