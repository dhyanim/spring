package com.mayank.advance;

import java.util.concurrent.CountDownLatch;

public class FoodProccesor implements Runnable {
	
	private CountDownLatch latch;
	
	private String[] items;
	
	public FoodProccesor(CountDownLatch latch, String[] items) {
		this.latch = latch;
		this.items = items;
		
	}

	@Override
	public void run() {
		for(int i=0; i< items.length;i++) {
			//System.out.println("Before processing the value of countdown latch is "+latch.getCount());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Item "+items[i]+ " is prepared");
			latch.countDown();
			//System.out.println("After processing the value of countdown latch is "+latch.getCount());
		}
	}

}
