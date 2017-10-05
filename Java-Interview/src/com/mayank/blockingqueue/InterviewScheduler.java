package com.mayank.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler  implements Runnable{
	
	private BlockingQueue<String> queue;

	public InterviewScheduler(BlockingQueue<String> blockingQueue) {
		this.queue = blockingQueue;
	}

	@Override
	public void run() {
		System.out.println("------ 10 candidates has been arrived for interview----- ");
		for(int i=0; i<=10; i++) {
			String msg = new String("Candidate "+i);
			try {
				queue.put(msg);
				System.out.println("Interview scheduled for : "+msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---- Interview Scheduled for all candidates ------");
		String stopInterview = new String("STOP");
		try {
			queue.put(stopInterview);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
