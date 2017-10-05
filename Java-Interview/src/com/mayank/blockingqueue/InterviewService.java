package com.mayank.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewService {
	
	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
		InterviewScheduler producer = new InterviewScheduler(blockingQueue);
		InterviewProccessor consumer = new InterviewProccessor(blockingQueue);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
		
	}

}
