package com.javabykiran.AssignmentCollection;

import java.util.HashSet;


public class HashSetOpration {
	public static void main(String[] args) {
		
	
	HashSet <String>hs=new HashSet<>();
	hs.add("java");
	hs.add("by");
	hs.add("Kiran");
	
	hs.forEach(t->System.out.println(t));
	
	System.out.println(hs.contains("java"));
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.remove("by"));
	System.out.println(hs);
}
}
