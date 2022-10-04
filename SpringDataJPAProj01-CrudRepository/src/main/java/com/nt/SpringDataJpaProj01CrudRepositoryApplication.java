package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class SpringDataJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		// create IOC Container
		ApplicationContext ctx =  SpringApplication.run(SpringDataJpaProj01CrudRepositoryApplication.class, args);
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
