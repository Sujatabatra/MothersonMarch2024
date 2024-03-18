package com.sujata.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Shubham")
public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	public Instrumentalist(@Autowired /*@Qualifier("tabla")*/ Instrument instrument) {
		super();
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();
	}

}
