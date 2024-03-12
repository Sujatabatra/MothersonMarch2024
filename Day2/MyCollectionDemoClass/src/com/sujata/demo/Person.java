package com.sujata.demo;

public class Person {

	private int pid;
	private String pName;
	
	public Person() {
		super();
	}
	public Person(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}
