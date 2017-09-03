package com.staticexample;

public class Horse  extends Animal{
	
	int x =0;	
	
	public void foo(){
		doStuff();
	}
	 static void doStuff(){
			System.out.println("from Horse");
		}
	 
	 public static void main(String[] args) {
		Animal animal = new Horse();
		animal.doStuff();
		//Horse horse = new Horse();
		doStuff();
	}

}
