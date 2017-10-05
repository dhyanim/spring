package com.mayank.cylicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	
 public static void main(String[] args) throws InterruptedException {
	CyclicBarrier cylicBarrier = new CyclicBarrier(2);
	CabService cabService1 = new CabService(cylicBarrier);
	Thread t1 = new Thread(cabService1, "Passenger1");
	t1.start();
	Thread.sleep(5000);
	
	
	CabService cabService2 = new CabService(cylicBarrier);
	Thread t2 = new Thread(cabService2, "Passenger2");
	t2.start();
	Thread.sleep(5000);
	
	CabService cabService3 = new CabService(cylicBarrier);
	Thread t3 = new Thread(cabService3, "Passenger3");
	t3.start();
	Thread.sleep(5000);
	
	CabService cabService4 = new CabService(cylicBarrier);
	Thread t4 = new Thread(cabService4, "Passenger4");
	t4.start();
	Thread.sleep(5000);
	
	System.out.println("All passenger arrived Cab will start now");
	
	
 }
}
