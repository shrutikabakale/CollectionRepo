package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;

public class ArrayList_demoOperations {
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("Perl");
	al.add("Java");
	al.add("C++");
	al.add("PHP");
	System.out.println(al);
	
	System.out.println("Element at Index 0 "+al.get(0));
	System.out.println("does list contain Java? "+al.contains("Java"));
	
	al.add(2,"Play");
	System.out.println(al);
	
	
	System.out.println("======");

	//System.out.println(al.remove("Perl"));
	//System.out.println(al.remove(0));
	//System.out.println(al);
	
	System.out.println("is arrayList empty "+al.isEmpty());
	System.out.println("Index of Perl "+al.indexOf("Perl"));
	System.out.println("Size of Array "+al.size());

 }
}
