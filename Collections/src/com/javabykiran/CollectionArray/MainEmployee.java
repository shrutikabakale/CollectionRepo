package com.javabykiran.CollectionArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class MainEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shuti", "5th jan", 5000);
		Employee e2 = new Employee(2, "Shreenika", "6th feb", 6000);
		Employee e3 = new Employee(3, "Raghavi", "7th march", 7000);
		Employee e4 = new Employee(4, "Rushi", "8th may", 8000);
		Employee e5 = new Employee(5, "Shlok", "9th june", 9000);

		/*
		 * Employee[]emp=new Employee[5]; 
		 * emp[0]=e1; 
		 * emp[1]=e2; 
		 * emp[2]=e3;
		 * emp[3]=e4;
		 * emp[4]=e5;
		 * 
		 * for (Employee e:emp){ System.out.println(e);
		 * 
		 * }	 
	 * EmployeeProcessor.calAvgSalary(emp); 
		 * for(int i=0;i<emp.length;i++){
		 * System.out.println(emp[i]); }
		 */

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		Employee e6 = new Employee(6, "Isha", "10th july", 10000);
		emp.add(e6);

		/*for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println("===1.Using simple for===");
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}

		System.out.println("====2.using enhanced for===");
		for (Employee t : emp) {
			System.out.println(t);
		}

		System.out.println("===3.Using Iterator===");
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===4.Using list Iterator===");
		ListIterator<Employee> litr = emp.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("===5.Using privious list Iterator===");
		// ListIterator<Employee> litrp=emp.listIterator();
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		System.out.println("===6.Using Enumerator===");
		Enumeration<Employee> t = Collections.enumeration(emp);
		while (t.hasMoreElements()) {
			System.out.println(t.nextElement());
		}

		System.out.println("===7.Using Lambda expression===");

		emp.forEach(e -> System.out.println(e));

		System.out.println("===8.Using Lambda expression===");

		emp.forEach(System.out::println);
		
		System.out.println("==========");
		System.out.println(emp.get(0));
	System.out.println(emp.get(2));
	
	Employee e7 = new Employee(7, "Aarya", "11th Aug", 13000);
	emp.add(0,e7);
	*/
	System.out.println("===9.Using Lambda expression===");
	Employee e7 = new Employee(7, "Aarya", "11th Aug", 13000);
	emp.add(e7);
	emp.forEach(System.out::println);
	
	System.out.println("=============");
	Employee e8 = new Employee(7, "Aarya", "11th Aug", 13000);
	emp.add(e8);
	emp.forEach(System.out::println);
	}
	
}
