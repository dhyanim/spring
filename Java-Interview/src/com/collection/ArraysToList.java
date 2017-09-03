package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {
		String[] sa = {"one","two","three","four"};
		//System.out.println(sa.toString());
		List sList = Arrays.asList(sa);
		System.out.println(sList);
		sList.set(3, "six");
		sa[1] = "five";
		System.out.println(sList);
		for(String s : sa){
			System.out.print(s + " ");
		}
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x< 3 ; x++){
			iL.add(x);
		}
		System.out.println(iL);
		Object[] oa = iL.toArray();
		for( Object i : oa){
			System.out.print(i);
		}
		Integer[] ia = new Integer[3];
		ia = iL.toArray(ia);
		for(int i : ia){
			System.out.print(i);
		}
		
	}
}
