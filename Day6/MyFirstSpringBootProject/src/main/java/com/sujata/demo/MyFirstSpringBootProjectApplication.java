package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	
//		Greet greet=new GoodMorning();Hardcoded the dependency
//		Greet greet=(Greet)springContainer.getBean("goodMorning");
		Greet greet=(Greet)springContainer.getBean("mrng");
		greet.wish();
	}

}
