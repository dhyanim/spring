package com.constructor;

public class ConstructorExample {
	int variable = 5;
	void method(){
		int variable = 30;
		System.out.println("value of variable "+this.variable);
	}
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		obj.method();
	}
	
}
