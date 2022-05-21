package com.javabykiran.AssignmentCollection;

import java.util.HashMap;

public class HashMapOpration {
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>(); 
		
		hm.put("one", "Java");
		hm.put("two", "By");
		hm.put("three", "Kiran");
		System.out.println(hm);
		System.out.println("Value of second:=" + hm.get("two"));
		// get element from hashmap using key
		System.out.println("Is HashMap empty:=" + hm.isEmpty());
		// check hashmap is empty or not

		// size of hashmap
		System.out.println("Size of the HashMap:=" + hm.size());
	
		hm.remove("three");
		System.out.println(hm);
	}

}
