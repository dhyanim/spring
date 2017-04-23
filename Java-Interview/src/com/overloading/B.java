package com.overloading;

public class B  extends A{
	
public String eat(){
	System.out.println("Eating from b");
	return null;
}
	
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		b.eat();
	}
}
