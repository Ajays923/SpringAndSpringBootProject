package com.nt.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.nt.document.Customer;
import com.nt.generator.IdGenerator;
import com.nt.service.ICustomerMgmtService;

@Component
public class MongoDBTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		/*Customer cust = new Customer();
		cust.setCno(1001);cust.setCname("Ajay");
		cust.setCaddrs("Abad");cust.setBillAmt(5000.0);
		System.out.println(service.registerCustomer(cust));*/
		
		/*Customer cust1 = new Customer();
		cust1.setCname("madhuri");cust1.setCaddrs("gangapur");
		System.out.println(service.registerCustomer(cust1));*/

		/* For update operation*/
		/*	Customer cust2 = new Customer();
			cust2.setId("6355f3e4f8bf1c7e33d9ab10");
			cust2.setCno(1002);cust2.setCname("piu");
			cust2.setCaddrs("hyd");
			System.out.println(service.registerCustomer(cust2));
				*/
		//============Save operation with Generate Id value
		/*	Customer cust3 = new Customer();
			cust3.setId(IdGenerator.generatedId());
			cust3.setCno(5001);
			cust3.setCname("neha");
			cust3.setCaddrs("vizaq");
			System.out.println(service.registerCustomer(cust3));*/
		
		/*Customer cust4 = new Customer();
		service.findAllCustomers().forEach(cust->{
			System.out.println(cust);
		});
		*/
		// ==================delete operation by ID============
		//System.out.println(service.removeCustomers("6356114b084d862162b1676c"));
		
		//====================findAll(Sort sort)=========
			Customer cust4 = new Customer();
		 List<Customer> opt =  service.findAllByOrderByIdAsc(Sort.by(Direction.ASC,"caddrs"));;
		 //List<Customer> opt =  service.findAllByOrderByIdAsc(cust4.getId());
		 System.out.println(opt);

	}
}
