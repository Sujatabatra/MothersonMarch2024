package com.sujata.demo;

public class AccountMain {
	public static void main(String args[]) {
		
		Account a001=new Account(1000);
		
		Thread gopal=new Thread(a001, "Gopal");
		Thread kopal=new Thread(a001,"Kopal");
		
		gopal.start();
		kopal.start();

	}
}
