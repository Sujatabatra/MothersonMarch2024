package com.sujata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int empId;
	
	@Column(name = "name")
	private String empName;
	
	@Column(name = "department")
	private String empDepartment;
	
	@Column(name = "designation")
	private String empDesignation;
	
	@Column(name = "Salary")
	private double empSalary;
}
