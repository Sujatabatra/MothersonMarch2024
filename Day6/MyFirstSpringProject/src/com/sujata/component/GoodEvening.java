package com.sujata.component;

import org.springframework.stereotype.Component;

@Component("eve")
public class GoodEvening implements Greet {

	@Override
	public void wish() {
		System.out.println("Good Evening Everyone!");

	}

}
