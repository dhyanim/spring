package com.mayank.core;

class Hi  implements Runnable {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello implements Runnable {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Hi hi = new Hi();
		Hello hello = new Hello();
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		t1.start();
		Thread.sleep(10);
		t2.start();
		//hi.show();
		//hello.show();

	}

}
