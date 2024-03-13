package com.sujata.demo;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(pName, pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(pName, other.pName) && pid == other.pid;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + "]";
	}
	
	
}
