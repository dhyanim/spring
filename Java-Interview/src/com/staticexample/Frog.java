package com.staticexample;

public class Frog {
	static int frogCount = 0;// Declare and initialize
								// static variable
	int frogInstanceCount = 0;

	public Frog() {
		frogCount += 1;
		frogInstanceCount += 1;
	}

	public static void main(String[] args) {
		Frog f1 = new Frog();
		Frog f2 = new Frog();
		Frog f3 = new Frog();
		System.out.println("Frog count is now " + frogCount);
		System.out.println("Frog count from instance " + f1.frogCount);
	}

}
