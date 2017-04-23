package com;

import com.model.Employee;
import com.model.Person;

public class Manager {
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.eat();
	Employee person = (Employee) new Person();
	person.eat();
	
	
}
}
