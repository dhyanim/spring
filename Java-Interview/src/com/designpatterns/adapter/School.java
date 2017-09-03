package com.designpatterns.adapter;

public class School {
	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		PenAdapter pa = new PenAdapter();
		aw.setP(pa);
		aw.WriteAssignment("Hello world assignment");
	}

}
