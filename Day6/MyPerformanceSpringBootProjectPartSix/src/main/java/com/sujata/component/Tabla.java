package com.sujata.component;

import org.springframework.stereotype.Component;

@Component
public class Tabla implements Instrument {

	@Override
	public void play() {
		System.out.println("DHIN TAK TAK");

	}

}
