package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Demo1 {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	al.add("Pune");
	al.add("Mumbai");
	al.add("yavatmal");
	al.add("Nagpur");
	
	Iterator<String>itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
	Collections.sort(al);
	for(String t:al)
	System.out.println(t);
	
}
}
