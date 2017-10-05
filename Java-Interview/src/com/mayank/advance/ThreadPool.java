package com.mayank.advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Test implements Runnable {

	private int id;
	
	public Test(int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println("Starting : "+id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed : "+id);
	}
	
}

public class ThreadPool {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0 ;i <5 ; i++){
			executor.submit(new Test(i));
		}
		executor.shutdown();
		System.out.println("All tasks submitted ...");
		try {
			executor.awaitTermination(10000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasks completed ...");
	}
}
