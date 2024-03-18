package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Kopal")
public class Singer implements Performer {
	
	private String song;
	
	public Singer(@Value("${performer.song}") String song) {
		super();
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing "+song);

	}

}
