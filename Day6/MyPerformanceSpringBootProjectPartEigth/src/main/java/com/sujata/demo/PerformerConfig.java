package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.component.Dancer;
import com.sujata.component.Singer;

@Configuration
public class PerformerConfig {

	@Bean(name = "Sumit")
	public Dancer getDancer() {
		return new Dancer("Kathak");
	}
	
	@Bean
	public Singer KumarSanu() {
		return new Singer("Some Kumar Sanu Song");
	}
}

