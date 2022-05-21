package com.javabykiran.AssignmentCollection;

import java.util.HashMap;

public class CopyMap {
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
	hm.put("First", "Java");
	hm.put("Second", "by");
	hm.put("Third", "Kiran");
	System.out.println(hm);
	
	HashMap<String,String>hm2=new HashMap<String,String>();
	hm2.put("c1", "Java");
	hm2.put("c2", "Selenium");
	hm2.put("c3", "J2EEE");
	System.out.println(hm2);
	
	hm.putAll(hm2);
	System.out.println(hm);
	
	
	
	}

}
