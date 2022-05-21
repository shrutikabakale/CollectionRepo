package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;
import java.util.List;

public class CheckSameEle {
	public static void main(String[] args) {
		
			ArrayList<String>al=new ArrayList<String>();
			al.add("one");
			al.add("Two");
			al.add("Three");
			al.add("Four");
			al.add("Five");
			al.add("Six");
			List<String>l=new ArrayList<String>();
			l.add("Shruti");
            l.add("Rushi");		
			System.out.println(al);
			System.out.println(l);
		
			System.out.println("Does al contains all list element "+al.contains(l));
			//System.out.println("Does al contains all list element "+al.containsAll(l));
			//System.out.println("Does al contains all list element "+al.containsAll(l));
			//System.out.println("Does al contains all list element "+al.containsAll(l));
			l.add("One");
			System.out.println("Does al contains all list element "+al.containsAll(l));
			System.out.println("Does al contains all list element "+al.contains(l));
			
			
		}
		

	}

