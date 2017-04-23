package com.model;

public class Person {
 private String firstName;
 private int age;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public void eat(){
	System.out.println("person eating");
}

}
