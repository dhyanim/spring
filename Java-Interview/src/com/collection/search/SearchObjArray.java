package com.collection.search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchObjArray {

	public static void main(String[] args) {
		String[] sa ={"A","C","D","B"};
		Arrays.sort(sa);
		for(String s : sa ){
			System.out.print(s + " ");
		}
		System.out.println(Arrays.binarySearch(sa, "B"));
		ReSortComparator rs = new ReSortComparator();
		Arrays.sort(sa,rs);
		for(String s : sa ){
			System.out.print(s + " ");
		}
		System.out.println(Arrays.binarySearch(sa, "B"));
		System.out.println(Arrays.binarySearch(sa, "B", rs));
	}
}

class ReSortComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		return b.compareTo(a);
	}
	
}
