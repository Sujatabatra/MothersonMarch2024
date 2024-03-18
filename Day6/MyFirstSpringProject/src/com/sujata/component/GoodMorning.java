package com.sujata.component;

import org.springframework.stereotype.Component;

@Component("mrng")
public class GoodMorning implements Greet {

	@Override
	public void wish() {
		System.out.println("Good Morning everyone!");

	}

}
