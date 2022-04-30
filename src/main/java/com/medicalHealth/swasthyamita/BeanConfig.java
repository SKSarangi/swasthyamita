package com.medicalHealth.swasthyamita;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BeanConfig {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*")
				.allowedMethods("POST", "PUT", "GET", "OPTIONS", "DELETE")
	            .allowedHeaders("Content-Type", "Accept", "X-Requested-With","remember-me", "Authorization")
	            .exposedHeaders("Content-Type", "Accept", "X-Requested-With", "remember-me", "Authorization");
			}
		};
	}
	
}

