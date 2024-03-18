package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Pankaj")
public class Juggler implements Performer {

	private int balls;
	
	@Value("2")
	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is Juggling "+balls+" balls");

	}

}
