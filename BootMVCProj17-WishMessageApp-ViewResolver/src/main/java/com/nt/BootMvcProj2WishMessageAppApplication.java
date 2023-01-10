package com.nt;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@SpringBootApplication
public class BootMvcProj2WishMessageAppApplication {

	/*public InternalResourceViewResolver createUBVR() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/
	
	/*@Bean
	public ResourceBundleViewResolver createRBVR() {
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		resolver.setBasename("com/nt/commons/view");
		return resolver;
	}*/
	@Autowired
	private ServletContext sc;
	
	@Bean
	public XmlViewResolver createXVR() {
		XmlViewResolver resolver = new XmlViewResolver();
		resolver.setLocation(new FileSystemResource(sc.getRealPath("/")+"/WEB-INF/views.xml"));
		return resolver;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj2WishMessageAppApplication.class, args);
	}

}
