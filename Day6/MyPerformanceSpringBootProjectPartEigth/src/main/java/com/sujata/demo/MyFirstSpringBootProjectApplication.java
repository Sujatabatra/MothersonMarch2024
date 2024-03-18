package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sujata.component.Dancer;
import com.sujata.component.Performer;
import com.sujata.component.Singer;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	
		Performer performer1=(Performer)springContainer.getBean("KumarSanu");

		performer1.perform();
	}
	
	
	
	
}
