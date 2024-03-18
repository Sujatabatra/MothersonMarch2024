package com.sujata.demo;

import org.springframework.stereotype.Component;

@Component("mrng")  //Object name to refere this component is mrng
//@Component default object name with be as that of class name but in camelCase
public class GoodMorning implements Greet {

	@Override
	public void wish() {
		System.out.println("Good Morning everyone!");

	}

}
