package com.javabykiran.SortObject;

import java.util.TreeSet;

public class TreeSetEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shuti", "5th jan", 5000);
		Employee e2 = new Employee(2, "Shreenika", "6th feb", 6000);
		Employee e3 = new Employee(3, "Raghavi", "7th march", 7000);
		Employee e4 = new Employee(4, "Rushi", "8th may", 8000);
		Employee e5 = new Employee(5, "Shlok", "9th june", 9000);
		
		TreeSet<Employee> tr=new TreeSet<Employee>();
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		tr.add(e5);
		
		System.out.println(tr.size());
	
		//tr.forEach(s->System.out.println(s));
		
		for(Employee t:tr)
		System.out.println(t);
		
		System.out.println("===========================");
		Employee e6 = new Employee(6, "Shlok", "9th june", 9000);
		tr.add(e6);
		tr.forEach(s->System.out.println(s));
		
		System.out.println("===========================");
		Employee e7 = new Employee(7, "Shlok", "9th june", 9000);
		tr.add(e7);
		tr.forEach(s->System.out.println(s));
	}

}
