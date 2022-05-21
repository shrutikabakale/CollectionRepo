package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;

public class CopyArrayList {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Pune");
		al.add("Nagpur");
		al.add("Mumbai");
		al.add("Delhi");
		System.out.println("Actual arrayList "+al);
		String[]newal=new String[al.size()];
		al.toArray(newal);
		System.out.println("Copied to new Arraylist");
		
		for(String str:newal){
			System.out.println(str);
			}
		}

}
