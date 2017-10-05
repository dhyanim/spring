package com.mayank.cylicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CabService implements Runnable {
	
	CyclicBarrier cycle;
	
	public CabService(CyclicBarrier cycle){
		this.cycle = cycle;
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has arrived");
		try {
			try {
				cycle.await();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName() +" is going to board the cab");	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
