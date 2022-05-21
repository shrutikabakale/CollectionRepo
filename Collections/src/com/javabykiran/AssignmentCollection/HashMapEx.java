package com.javabykiran.AssignmentCollection;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,String>mp=new HashMap<String,String>();
		mp.put("first","Java");
		mp.put("Second","by");
		mp.put("Third","Kiran");
		System.out.println(mp);
		
		
		Set<String> keys=mp.keySet();
		for(String key:keys){
			System.out.println("Value of "+key+" is "+mp.get(key));
		}
	}

}
