package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {

	int id;
	String name;
	String city;
	int standard;

	Student(int id, String name, String city, int standard) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.standard = standard;
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "yash", "GKP", 10));
		list.add(new Student(2, "Manjeet", "Delhi", 9));
		list.add(new Student(3, "Amit", "Mumbai", 8));
		list.add(new Student(4, "Satya", "Noida", 10));
		list.add(new Student(5, "Nilesh", "GKP", 12));

		
		///now i want to sort the student based on their name
		
		Collections.sort(list, new StudentNameComparator());
		Iterator<Student> s = list.iterator();
		while(s.hasNext()) {
			Student ss= s.next();
			System.out.println(ss.id+" "+ss.name+" "+ss.city+" "+ss.standard);
		}

	}

}
