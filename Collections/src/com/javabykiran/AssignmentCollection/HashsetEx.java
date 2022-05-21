package com.javabykiran.AssignmentCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {
	public static void main(String[] args) {
		HashSet <String>hs=new HashSet<>();
		hs.add("java");
		hs.add("by");
		hs.add("Kiran");
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		hs.forEach(t->System.out.println(t));

}
}
