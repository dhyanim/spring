package com.mayank.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	
	Random random = new Random();
	
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public  void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt());
		}
	}
	
	public synchronized void stageTwo() {
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt());
		}
	}
	
	public void process(){
		for(int i =0 ; i<1000 ; i++){
			stageOne();
			stageTwo();
		}
	}
	
	public static void main(String[] args) {
		Worker worker = new Worker();
		System.out.println("Starting .....");
		Long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				worker.process();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				worker.process();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Long end = System.currentTimeMillis();
		System.out.println("Time taken :" +(end-start));
		System.out.println("List1 :"+worker.list1.size() + " List2 : "+worker.list2.size());
		
	}
}
