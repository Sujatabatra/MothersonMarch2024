package com.sujata.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.component.Greet;

public class ComponentClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer
		=new AnnotationConfigApplicationContext(GreetConfig.class);
		
		Greet greet=(Greet)springContainer.getBean("eve");
		greet.wish();
		

	}

}
