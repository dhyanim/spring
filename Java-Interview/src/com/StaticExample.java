package com;

public class StaticExample {

private  int i = 10;
public int j;
public static void test(){
	System.out.println("Inside test");
}

public static void main(String[] args) {
	StaticExample obj = new StaticExample();
	obj.i = 12;
	System.out.println(obj.i);
}
	
}
