package com.designpatterns.builder;

public class PhoneBuilder {
	
	private String os;
	private String processor;
	private int mah;
	private int resolution;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setMah(int mah) {
		this.mah = mah;
		return this;
	}
	public PhoneBuilder setResolution(int resolution) {
		this.resolution = resolution;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, processor, mah, resolution);
	}

}
