package com.mayank.advance;

import java.util.Scanner;

class Processor extends Thread {
	
	private volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown(){
		running = false;
	}
}




public class ThreadSyncDemo {
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		System.out.println("Press return to stop");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		p1.shutDown();
	}
}
