package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Setter
	@Getter
	private int eId;
	@Setter
	@Getter
	private String eName;
	@Setter
	@Getter
	private String designation;
	@Setter
	@Getter
	private String department;
	@Setter
	@Getter
	private double salary;
	
}
