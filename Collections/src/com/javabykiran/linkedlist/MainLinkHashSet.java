package com.javabykiran.linkedlist;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import com.javabykiran.CollectionArray.Employee;

public class MainLinkHashSet {

	
	public static void main(String[] args) {

		//LinkedHashSet lhs = new LinkedHashSet();
		 LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();

		Employee e1 = new Employee(1, "Shuti", "5th jan", 5000);
		Employee e2 = new Employee(2, "Shreenika", "6th feb", 6000);
		Employee e3 = new Employee(3, "Raghavi", "7th march", 7000);
		Employee e4 = new Employee(4, "Rushi", "8th may", 8000);
		Employee e5 = new Employee(5, "Shlok", "9th june", 9000);

		lhs.add(e1);
		lhs.add(e2);
		lhs.add(e3);
		lhs.add(e4);
		lhs.add(e5);
		
		
		/*
			System.out.println("===1.using enhanced for===");			
			for (Employee t : lhs) {
				System.out.println(t);
			}
			
			System.out.println("===2.Using Iterator===");
			
			Iterator<Employee> itr =lhs.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}*/
				
				
				/*System.out.println("===3.Using Enumerator===");
				Enumeration<Employee> e=Collections.enumeration(lhs);
				while(e.hasMoreElements()){
				System.out.println(e.nextElement());
				}*/
				
				/*System.out.println("===4.Using Lambda expression===");
				
			lhs.forEach(t->System.out.println(t));
				*/
				
				System.out.println("==5.Using Lambda expression===");
				Employee e6 = new Employee(5, "Shlok", "9th june", 9000);
				//lhs.add(e5);
				lhs.add(e6);
				lhs.add(null);
				lhs.add(null);
				lhs.forEach(System.out::println);
			
	}

}
