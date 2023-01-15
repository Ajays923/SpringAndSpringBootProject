package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@SpringBootApplication
public class BootMvcProj18BeanNameViewResolverPdfExcelReportApplication {

	@Bean
	public BeanNameViewResolver createViewResolver() {
		System.out.println("BootMvcProj18BeanNameViewResolverPdfExcelReportApplication.createViewResolver()");
		BeanNameViewResolver resolver = new BeanNameViewResolver();
		resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return resolver;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj18BeanNameViewResolverPdfExcelReportApplication.class, args);
	}

}
