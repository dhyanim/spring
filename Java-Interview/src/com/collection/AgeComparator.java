package com.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if (obj1.getAge() > obj2.getAge()) {
			return 1;
		} else if (obj2.getAge() > obj1.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}

}
