package com.overriding;

public class Animal {
	public void eat() throws Exception {
		System.out.println("Animal eating ");
	}
	
	public Animal getAnimal(){
		return new Horse();
	}
	public int foo(){
		char c ='c';
		return c;
	}
}
