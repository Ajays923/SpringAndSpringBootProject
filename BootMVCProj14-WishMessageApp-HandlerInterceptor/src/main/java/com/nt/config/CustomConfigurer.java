package com.nt.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptor.TimeoutCheckInterceptor;

@Component
public class CustomConfigurer implements WebMvcConfigurer {

	public CustomConfigurer() {
		System.out.println("CustomConfigurer::0-param constructor");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("CustomConfigurer.addInterceptors()");
		registry.addInterceptor(new TimeoutCheckInterceptor());
		
	}
	
}
