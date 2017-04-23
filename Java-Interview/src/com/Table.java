package com;

public class Table {

	
	public static void main(String[] args) {
		//System.out.println("Hello world");
		String s = " I live in India";
		String[] split = s.split(" ");
		System.out.print(split[1]);
		for(int i =0; i<=split.length-1; i++){
			//System.out.print(split[i]);
		}
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		//System.out.println(result.trim());
		
	}
	
}
