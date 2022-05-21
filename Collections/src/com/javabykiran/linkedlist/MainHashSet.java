package com.javabykiran.linkedlist;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

import com.javabykiran.CollectionArray.Employee;

public class MainHashSet {

	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<Employee>();

		Employee e1 = new Employee(1, "Shuti", "5th jan", 5000);
		Employee e2 = new Employee(2, "Shreenika", "6th feb", 6000);
		Employee e3 = new Employee(3, "Raghavi", "7th march", 7000);
		Employee e4 = new Employee(4, "Rushi", "8th may", 8000);
		Employee e5 = new Employee(5, "Shlok", "9th june", 9000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

	/*	System.out.println("===1.Using simple for===");
		
		System.out.println("===1.Using simple for===");
		for(int i=0;i<hs.size();i++){
			System.out.println(hs.get(i));
			
		}
		
		
			System.out.println("===1.using enhanced for===");			
			for (Employee t : hs) {
				System.out.println(t);
			}
			
			System.out.println("===2.Using Iterator===");
			
			Iterator<Employee> itr =hs.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}

				System.out.println("===4.Using list Iterator===");
				ListIterator<Employee> litr=hs.listIterator();
				while(litr.hasNext()){
					System.out.println(litr.next());
				}
				
				System.out.println("===5.Using privious list Iterator===");
			
				while(litr.hasPrevious()){
					System.out.println(litr.previous());
				}
				
				System.out.println("===6.Using Enumerator===");
				Enumeration<Employee> e=Collections.enumeration(hs);
				while(e.hasMoreElements()){
				System.out.println(e.nextElement());
				}
				
				System.out.println("===7.Using Lambda expression===");
				
				hs.forEach(t->System.out.println(t));
				*/
				
				System.out.println("===8.Using Lambda expression===");

			        
			
			/*System.out.println("===============");
			
			Employee e6 = new Employee(5, "Shlok", "9th june", 9000);
			hs.add(e6);
			hs.forEach(System.out::println);
			
			
			System.out.println("===============");
			Employee e7 = new Employee(1, "Shuti", "5th jan", 5000);
			hs.add(e7);
			
			hs.forEach(System.out::println);*/
			

			//System.out.println("===============");
				Employee e6 = new Employee(2, "Shreenika", "6th feb", 6000);
			hs.add(e6);
			hs.forEach(System.out::println);
	}
}
