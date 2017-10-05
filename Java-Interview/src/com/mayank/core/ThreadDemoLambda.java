package com.mayank.core;

public class ThreadDemoLambda {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = () ->{
			for (int i = 0; i <= 10; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.setName("Hi Thread");
		//t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getName());
		Thread t2 = new Thread(r2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("Hello Thread");
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
		//System.out.println(t1.isAlive());
		System.out.println("bye");
		
	}
}
