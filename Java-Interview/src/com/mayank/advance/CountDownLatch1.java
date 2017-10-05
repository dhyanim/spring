package com.mayank.advance;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch1 {
	
	
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(args.length);
		 Thread t1 = new Thread(new FoodProccesor(latch, args));
		 t1.start();
		 try {
			 System.out.println("Order is recieved and is being prepared");
			latch.await();
			 System.out.println("Order is prepared and is ready to be dispatched");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
