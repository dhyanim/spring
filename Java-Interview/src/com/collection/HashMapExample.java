package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.model.Person;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "mayank");
		map.put("age", "21");
		map.put("name", "test");
		map.put(null,"hello");
		map.put(null,"hello1");
		System.out.println(map);
		
		
		LinkedHashMap<String, Object> linkedMap = new LinkedHashMap<String, Object>();
		linkedMap.put(null,"hello");
		linkedMap.put(null,"hello1");
		//linkedMap.put("name", person);
		linkedMap.put("test", "test");
		System.out.println(linkedMap);
		
		
		Person person1 = new Person();
		person1.setFirstName("mayank");
		person1.setAge(29);
		Person person2 = new Person();
		person1.setFirstName("test");
		person1.setAge(25);
		TreeMap<String, Person> treeMap = new TreeMap<String, Person>();
		treeMap.put("person1", person1);
		treeMap.put("person2", person2);
		ArrayList list = new ArrayList();
		list.add(treeMap);
		//Collections.sort(list);
		System.out.println((Person)list.get(0));
		
		
	}
	
}
