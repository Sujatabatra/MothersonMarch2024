package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.component.Performer;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	
		Performer performer1=(Performer)springContainer.getBean("Kopal");

		performer1.perform();
	}

}
