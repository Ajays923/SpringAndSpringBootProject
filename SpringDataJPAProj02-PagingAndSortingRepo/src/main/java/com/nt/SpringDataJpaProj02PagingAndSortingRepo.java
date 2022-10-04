package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaProj02PagingAndSortingRepo{

	public static void main(String[] args) {
		// create IOC Container
		SpringApplication.run(SpringDataJpaProj02PagingAndSortingRepo.class, args);
		/*// get Service class obj
		ICoronaVaccineMgmtService service = ctx.getBean("vaccineMgmtService",ICoronaVaccineMgmtService.class);
		// invoke b.methods
			try {
				// create Entity class obj
				CoronaVaccine vaccine = new CoronaVaccine(1L,"covaxin","Bharat-BioTech","India",254.0,3);
				// call b.method
				System.out.println(service.registerVaccine(vaccine));
			}
			catch(DataAccessException dae) {
			dae.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		// close container
		((ConfigurableApplicationContext) ctx).close();*/
	}

}
