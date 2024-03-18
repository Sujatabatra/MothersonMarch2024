package com.sujata.component;

import org.springframework.stereotype.Component;

@Component("Kopal")
public class Singer implements Performer {

	@Override
	public void perform() {
		System.out.println("Singer is singing lalalala!");

	}

}
