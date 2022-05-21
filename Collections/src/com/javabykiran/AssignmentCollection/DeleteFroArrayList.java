package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;

public class DeleteFroArrayList {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		al.add("Six");
	
		System.out.println(al);
		al.clear();
		System.out.println(al);
		
	}
	

}
