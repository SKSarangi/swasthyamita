package com.medicalHealth.swasthyamita;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


public class WebConfig extends WebMvcConfigurerAdapter{
	
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("POST", "PUT", "GET", "OPTIONS", "DELETE")
            .allowedHeaders("Content-Type", "Accept", "X-Requested-With","remember-me", "Authorization")
            .exposedHeaders("Content-Type", "Accept", "X-Requested-With", "remember-me", "Authorization");
        
	}

}
