package com.sujata.component;

import org.springframework.stereotype.Component;

@Component("Kapil")
public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in Free Style");

	}

}
