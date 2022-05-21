package com.javabykiran.linkedlist;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.javabykiran.CollectionArray.Employee;

public class MainLinklist {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Shuti", "5th jan", 5000);
		Employee e2 = new Employee(2, "Shreenika", "6th feb", 6000);
		Employee e3 = new Employee(3, "Raghavi", "7th march", 7000);
		Employee e4 = new Employee(4, "Rushi", "8th may", 8000);
		Employee e5 = new Employee(5, "Shlok", "9th june", 9000);

		LinkedList<Employee> emp = new LinkedList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		/*System.out.println("===1.Using simple for===");
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));

		}
		System.out.println("===2.using enhanced for===");
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
		Enumeration<Employee> e = Collections.enumeration(emp);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("===7.Using Lambda expression===");

		emp.forEach(t -> System.out.println(t));

		System.out.println("===8.Using Lambda expression===");

		emp.forEach(System.out::println);

		System.out.println("==========");
		System.out.println(emp.get(0));
		System.out.println(emp.get(2));

		Employee e6 = new Employee(6, "Aarya", "11th Aug", 13000);
		emp.add(0, e6);
		System.out.println(emp.size());
		Employee e7 = new Employee(6, "Aarya", "11th Aug", 13000);
		emp.add(0, e7);
		// Employee e6 = new Employee(6, "Aarya", "11th Aug", 13000);
		emp.add(0, e6);
		System.out.println("===9.Using Lambda expression===");
		emp.add(0, e3);*/
		
		emp.add(e3);
		emp.forEach(System.out::println);
		System.out.println(emp.size());
	}

}
