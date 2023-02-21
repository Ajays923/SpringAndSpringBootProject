package com.nt.runners;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.prod.Product;
import com.nt.model.promotions.Offers;
import com.nt.repo.prod.IProductRepo;
import com.nt.repo.promotions.IOffersRepo;

@Component
public class MultiDataSourceRunners implements CommandLineRunner {
	@Autowired
	private IProductRepo prodRepo;
	@Autowired
	private IOffersRepo offerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// save objects
		prodRepo.saveAll(Arrays.asList(new Product("Table",100.0,60000.0),
																	new Product("Laptops",10.0,400000.0),
																	new Product("Smart Watch",15.0,70000.0)));
		System.out.println("Product Are Saved");
		System.out.println("------------------------------------------------------------------------------");
		
		offerRepo.saveAll(Arrays.asList(new Offers("Buy-1-Get-1","B1G1",100.0,LocalDateTime.of(2023,12,15, 10, 12)),
																	new Offers("Buy-1-Get-2","B1G2",200.0,LocalDateTime.of(2023,12,15, 10, 12)),
																	new Offers("Buy-2-Get-2","B2G2",200.0,LocalDateTime.of(2023,12,15, 10, 12))));		
		System.out.println("Offers are Saved");
		System.out.println("-------------------------------------------------------------------------------------");
	
		System.out.println("---------------------Display records(Products)------------------------------------------");
		System.out.println("=========================");
		prodRepo.findAll().forEach(System.out::println);
		System.out.println("===============================");
		System.out.println("---------------------Display records(offers)------------------------------------------");
		offerRepo.findAll().forEach(System.out::println);
		
		
	}

}
