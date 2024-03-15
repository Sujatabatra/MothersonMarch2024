package com.sujata.demo;

class Base{
	public void iterator(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
	}
}

class Derived extends Base implements Runnable{
	private int n;
	
	public Derived(int n) {
		super();
		this.n = n;
	}

	public void perform() {
		iterator(n);
	}

	@Override
	public void run() {
		perform();
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		
	}
}

class ThreadInfo extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class MySecondThreadDemo {

	public static void main(String[] args) {
		Derived threadJob=new Derived(6);
		
		Thread thread1=new Thread(threadJob);
		thread1.start();
		
		Thread thread2=new Thread(new Derived(4), "SecondThread");
		thread2.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		

	}

}
