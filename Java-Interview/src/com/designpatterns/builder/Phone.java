package com.designpatterns.builder;

public class Phone {
	private String os;
	private String processor;
	private int mah;
	private int resolution;
	
	
	public Phone(String os, String processor, int mah, int resolution) {
		super();
		this.os = os;
		this.processor = processor;
		this.mah = mah;
		this.resolution = resolution;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", mah=" + mah
				+ ", resolution=" + resolution + "]";
	}
	
	
}
