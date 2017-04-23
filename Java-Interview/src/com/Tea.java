package com;

public class Tea extends AbstractClass {

	@Override
	void eat() {
		System.out.println("eating ");
	}

	public static void main(String[] args) {
		Tea tea = new Tea();
	    tea.test();
	}

}
