package com.sujata.component;

import org.springframework.stereotype.Component;

@Component("Pankaj")
public class Juggler implements Performer {

	@Override
	public void perform() {
		System.out.println("Juggler is Juggling 5 balls");

	}

}
