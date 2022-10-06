package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICoronaVaccineMgmtService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;

	@Override
	public void run(String... adrgs) throws Exception {
		//service.searchVaccineByCompany("modern").forEach(System.out::println);
		//service.searchVaccinesByCompanies("pyzar", "Russie", "modern").forEach(System.out::println);
		
		/*service.searchVaccinesDetailsByNames("moderena", "sputuk").forEach(vacc->{
			System.out.println(vacc[0]+" "+vacc[1]+" "+vacc[2]);
		});*/
		
		/*service.searchVaccinesDetailsByNames("moderena", "sputuk").forEach(vacc->{
			Arrays.stream(vacc).forEach(vac->	System.out.print(vac+" "));		
			System.out.println();
		});*/
		
		//service.searchVaccinesNamesByPriceRange(1000.0, 3500.0).forEach(System.out::println);
		
		/*Optional opt = service.searchVaccinesByName("pyzar");
		if(opt.isPresent())
			System.out.println("no. of record"+opt);
		else
			System.out.println("no record found");*/
		System.out.println("-------------------------------------------------");
		/*Object obj = service.searchVaccineDataByName("pyzar");
		Object details[] = (Object[])obj;
		for(Object val:details) {
			System.out.print(" "+val);
		}
		System.out.println();*/
		System.out.println("=================================");
		/*String str = service.searchVaccineCountryByName("pyzar");
		System.out.println("Country Name:: "+str);
		*/
		System.out.println("=============Aggregate Function============");
		System.out.println(service.getVaccinesCount());
		System.out.println("=============MIN(),MAX(),SUM(),AVG()============");
		/*Object result[] =(Object[])service.getVaccinesAggregateDataByPriceRange(1000.0, 3500.0);
		System.out.println("Count ::"+result[0]);
		System.out.println("MAX ::"+result[1]);
		System.out.println("MIN ::"+result[2]);
		System.out.println("SUM ::"+result[3]);
		System.out.println("AVG ::"+result[4]);
		*/
		System.out.println("============Non-Select Operations================");
		/*int update = service.updateVaccinePriceByCountry(800.0,"Rusia");
		System.out.println("No.of record updated :: "+update);*/
		
		/*int remove = service.removeVaccineByPriceRange(500.0, 800.0);
		System.out.println("No .of records deleted :: "+remove);*/
		
		System.out.println("================Native SQL==========================");
		/*int record = service.insertVaccine( "RUSSIE","RUSIA", "SPUTNIK", 586.0, 2);
		if(record==0)
			System.out.println("record not inserted");
		else
			System.out.println("record inserted");*/
		
		System.out.println("Todays System Date And Time :: "+service.SysDate());
		
		/*int table = service.CreateTempTable();
		System.out.println(table);
		if(table==0)
			System.out.println("Table is created");
		else
			System.out.println("Table is not created");*/
		
		int tableDrop = service.dropTable();
		if(tableDrop==0)
			System.out.println("Table is deleted from db");
		else
			System.out.println("Table is not delete");
	}
}
