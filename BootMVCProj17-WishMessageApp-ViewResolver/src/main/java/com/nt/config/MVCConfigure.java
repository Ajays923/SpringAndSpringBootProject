package com.nt.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Component
public class MVCConfigure implements WebMvcConfigurer {
	
	/*@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("MVCConfigure.configureViewResolvers()");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		registry.viewResolver(resolver);
	}*/	
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("MVCConfigure.configureViewResolvers(-)");
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(InternalResourceView.class);
		registry.viewResolver(resolver);
	}
}
	