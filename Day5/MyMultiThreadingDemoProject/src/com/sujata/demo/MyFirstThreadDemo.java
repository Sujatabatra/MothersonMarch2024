package com.sujata.demo;

class MyFirstThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i from run "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFirstThreadDemo {

	public static void main(String[] args) {
		//New Born State
		MyFirstThread t1=new MyFirstThread();
		
		
		t1.start();
		
		t1.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
