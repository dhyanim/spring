package com.polymorphism;

public class Horse {
	public Halter myHalter = new Halter();
	public void tieRope(LeadRope rope){
		myHalter.tieRope(rope);	//Delegate tie behavior to the
								//Halter object
	}

}
