package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {

	public static void main(String[] args) {
		List<Student> studentList  = new ArrayList<Student>();
		Student stu1 = new Student("Mayank", 18);
		Student stu2 = new Student("Shashank", 17);
		Student stu3 = new Student("Aman", 19);
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		Collections.sort(studentList);
		for(Student obj : studentList){
			System.out.println("Name : "+obj.getName());
		}
		//System.out.println(studentList);
		Collections.sort(studentList, new AgeComparator());
		for(Student obj : studentList){
			System.out.println(" Age : "+obj.getAge() );
		}
	}
}
