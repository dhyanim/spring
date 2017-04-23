package com.enums;

public class EnumDemo {
	Directions dir;

	public EnumDemo(Directions dir) {
		this.dir = dir;
	}

	public void getMyDirection() {
		switch (dir) {
		case EAST:
			System.out.println("In East direction");
			break;
		case WEST:
			System.out.println("In West direction");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		EnumDemo obj = new EnumDemo(Directions.WEST);
		obj.getMyDirection();
		Directions enumDirections = Directions.SOUTH;
		System.out.println(enumDirections.getDirectionCode());
	}
}
