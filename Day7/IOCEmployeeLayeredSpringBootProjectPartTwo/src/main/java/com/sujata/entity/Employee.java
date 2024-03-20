package com.sujata.entity;



public class Employee {

	private int eId;
	private String eName;
	private String designation;
	private String department;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int eId, String eName, String designation, String department, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
}
