package com.designpatterns.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setMah(3000).getPhone();
		System.out.println(phone);
	}
}
