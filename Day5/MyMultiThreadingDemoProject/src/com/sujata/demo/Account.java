package com.sujata.demo;

public class Account implements Runnable {

	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	/* synchronized */ public void withdraw() {
		synchronized (this) {

			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw, your balance is Rs." + balance);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= 800;
				System.out.println(Thread.currentThread().getName() + " your balance after withdrawl is Rs." + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you have insufficient balance to withdraw, your balance is Rs." + balance);
			}
		}
	}

	@Override
	public void run() {
		withdraw();

	}

}
