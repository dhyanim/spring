package com.mayank.core;

class Q {
	int num;
	boolean valueSet = false;
	
	 public synchronized void put(int num) {
		 while(valueSet){
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("Put" + num);
		 this.num = num;
		 valueSet = true;
		 notify();
	 }
	 public synchronized void getNum(){
		 while(!valueSet){
			 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 System.out.println("Get" + num);
		 valueSet = false;
		 notify();
	 }		
	
}

class Producer implements Runnable {
	 Q q;
	 public Producer(Q q){
		 this.q = q;
		 Thread t1 = new Thread(this, "Producer");
		 t1.start();
	 }
	 public void run() {
		 int i =0;
		 while(true){
			 q.put(i++);
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 
	 }
}

class Consumer implements Runnable {
	 Q q;
	 public Consumer(Q q){
		 this.q = q;
		 Thread t1 = new Thread(this, "Consumer");
		 t1.start();
	 }
	 public void run() {
		 while(true){
			 q.getNum();
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 
	 }
}

public class InterThreadDemo {

	public static void main(String[] args) {
		Q q1 = new Q();
		new Producer(q1);
		new Consumer(q1)	;
	}
}
