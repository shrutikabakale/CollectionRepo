package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddDataListtoArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("second");
		al.add("Third");
		al.add("Random");
		
		System.out.println("Arraylist "+ al);
		
		List<String>l=new ArrayList<String>();
		l.add("one");
		l.add("Two");
		al.addAll(l);
		System.out.println(al);
		Iterator<String>ilr=al.iterator();
		
		while(ilr.hasNext()){
			System.out.println(ilr.next());
		}
	}

}
