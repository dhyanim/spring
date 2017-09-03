package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banana");
		System.out.println("Unsorted  : "+fruits);
		Collections.sort(fruits);
		System.out.println("Sorted : "+fruits);
	}
	
}
