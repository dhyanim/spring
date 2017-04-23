package com.overriding;

public class TestAnimals {
public static void main(String[] args) {
	Animal animal = new Horse();
	if(animal instanceof Horse){
		Horse h = (Horse) animal;
		h.ride();
	}
	System.out.println(animal.foo());
	
	
}
}
