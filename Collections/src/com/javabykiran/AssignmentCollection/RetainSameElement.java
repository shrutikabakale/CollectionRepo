package com.javabykiran.AssignmentCollection;

import java.util.HashSet;
import java.util.Iterator;

public class RetainSameElement {
	public static void main(String[] args) {
		HashSet <String>hs=new HashSet<>();
		hs.add("java");
		hs.add("by");
		hs.add("Kiran");
		hs.add("Pune");
		
		hs.forEach(t->System.out.println(t));
		HashSet <String>hs2=new HashSet<>();
		hs2.add("java");
		hs2.add("by");
		hs2.add("Kiran");
		hs2.add("j2eee");
		
		hs2.forEach(t->System.out.println(t));
		hs.retainAll(hs2);

		System.out.println("" + "Common Hashset content from both:");
		System.out.println(hs);
}

}
	


