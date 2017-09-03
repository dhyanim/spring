package com.equals;

public class EqualTest {

	public static void main(String[] args) {
		Moof moof = new Moof(8);
		Moof moof1 = new Moof(8);
		System.out.println(moof.hashCode());
		System.out.println(moof1.hashCode());
		System.out.println(moof.equals(moof1));
	}
}

class Moof {
	private int moofValue;

	public Moof(int val) {
		moofValue = val;
	}

	public int getMoofValue() {
		return moofValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Moof) && ((Moof) obj).getMoofValue()== this.moofValue){
			return true;
		} else {
			return false;
		}
	}
}
