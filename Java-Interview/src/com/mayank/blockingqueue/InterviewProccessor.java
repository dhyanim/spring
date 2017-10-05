package com.mayank.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProccessor  implements Runnable{
	
	private BlockingQueue<String> queue;

	public InterviewProccessor(BlockingQueue<String> queue) {
		
		this.queue = queue;
	}

	@Override
	public void run() {
		String msg;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			while(!(msg=queue.take()).equals("STOP")){
				System.out.println("Interview completed for "+msg);
				Thread.sleep(10000);
			}
			System.out.println("----- Interview completed for all 10 candidates ------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
