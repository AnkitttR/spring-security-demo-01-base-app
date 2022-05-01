package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
public class DemoAppConfig {

	// define a bean for ViewResolver
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalViewResolver viewResolver = new InternalViewResolver();
	}
	
}
