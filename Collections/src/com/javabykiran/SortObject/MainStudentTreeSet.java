package com.javabykiran.SortObject;

import java.util.TreeSet;


public class MainStudentTreeSet {
	public static void main(String[] args) {
		
		TreeSetStudent s1=new TreeSetStudent(1,"Shruti","BE",82.6f);
		TreeSetStudent s2=new TreeSetStudent( 2,"Raghvi","Mca",77.6f);
		TreeSetStudent s3=new TreeSetStudent( 3,"Rashi","ad java",67.6f);
		TreeSetStudent s4=new TreeSetStudent( 4,"megha","testing",97.6f);
		TreeSetStudent s5=new TreeSetStudent( 5,"jack","java",78.6f);
		
		TreeSet<TreeSetStudent> std=new TreeSet<TreeSetStudent>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		//std.add(null);--exception
		
		System.out.println(std.size());
		std.forEach(t->System.out.println(t));
		
		
		
	
		
		
	}

}
