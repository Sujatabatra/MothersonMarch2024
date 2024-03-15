package com.sujata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Husband {

	@Id
	private String husbandId;
	private String husbandName;
	
	public Husband() {
		
	}

	public Husband(String husbandId, String husbandName) {
		super();
		this.husbandId = husbandId;
		this.husbandName = husbandName;
	}

	public String getHusbandId() {
		return husbandId;
	}

	public void setHusbandId(String husbandId) {
		this.husbandId = husbandId;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	
	
}
