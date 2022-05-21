package com.javabykiran.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import com.javabykiran.SortObject.Array;

public class MainVectorEmployee {


		public static void main(String[] args) {
			VectorEmployee e1 = new VectorEmployee(1, "Shuti", "5th jan", 5000);
			VectorEmployee e2 = new VectorEmployee(2, "Shreenika", "6th feb", 6000);
			VectorEmployee e3 = new VectorEmployee(3, "Raghavi", "7th march", 7000);
			VectorEmployee e4 = new VectorEmployee(4, "Rushi", "8th may", 8000);
			VectorEmployee e5 = new VectorEmployee(5, "Shlok", "9th june", 9000);

			Vector<VectorEmployee> vemp = new Vector<VectorEmployee>();
			vemp.add(e1);
			vemp.add(e2);
			vemp.add(e3);
			vemp.add(e4);
			vemp.add(e5);

			/*System.out.println("===1.Using simple for===");
			for (int i = 0; i < vemp.size(); i++) {
				System.out.println(vemp.get(i));
				
			}
			vemp.add(e5);
			System.out.println("===2.using enhanced for===");
			for (VectorEmployee t : vemp) {
				System.out.println(t);
			}
			System.out.println("===3.Using Iterator===");
			Iterator<VectorEmployee> itr = vemp.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("===4.Using list Iterator===");
			ListIterator<VectorEmployee> litr = vemp.listIterator();
			while (litr.hasNext()) {
				System.out.println(litr.next());
			}
			System.out.println("===5.Using privious list Iterator===");
			// ListIterator<VectorEmployee> litrp=emp.listIterator();
			while (litr.hasPrevious()) {
				System.out.println(litr.previous());
			}
			System.out.println("===6.Using Enumerator===");
			Enumeration<VectorEmployee> e = Collections.enumeration(vemp);
			while (e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			System.out.println("===7.Using Lambda expression===");
			vemp.forEach(t -> System.out.println(t));
			System.out.println("===8.Using Lambda expression===");

			vemp.forEach(System.out::println);*/

			System.out.println("==========");
			System.out.println(vemp.get(0));
			System.out.println(vemp.get(2));

			VectorEmployee e6 = new VectorEmployee(6, "Aarya", "11th Aug", 13000);
			vemp.add(0, e6);
			System.out.println(vemp.size());
			VectorEmployee e7 = new VectorEmployee(6, "Aarya", "11th Aug", 13000);
			vemp.add(0, e7);
			System.out.println("===9.Using Lambda expression===");
				
			Collections.sort(vemp);		
			 
			vemp.forEach(System.out::println);
			System.out.println(vemp.size());
		}

	}


