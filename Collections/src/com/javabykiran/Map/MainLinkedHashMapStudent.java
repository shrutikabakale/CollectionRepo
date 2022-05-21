package com.javabykiran.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainLinkedHashMapStudent {
	
	public static void main(String[] args) {
		LinkedHashMapStudent s1=new LinkedHashMapStudent(1, "Pavan", "Bcom");
		LinkedHashMapStudent s2=new LinkedHashMapStudent(11, "Pritvi", "MCA");
		LinkedHashMapStudent s3=new LinkedHashMapStudent(22, "Jal", "BSc");
		LinkedHashMapStudent s4=new LinkedHashMapStudent(55, "Agnni", "BE");
		LinkedHashMapStudent s5=new LinkedHashMapStudent(87, "Akash", "Sce");
		
		LinkedHashMap<Integer,LinkedHashMapStudent> lmp=new LinkedHashMap<Integer,LinkedHashMapStudent>();
		
		lmp.put(28, s1);
		lmp.put(34, s2);
		lmp.put(76, s3);
		lmp.put(45, s4);
		lmp.put(2898, s5);
		lmp.put(45, s1);
		//lmp.put(45, null);
		lmp.put(40, null);
		
		lmp.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println("====using set=====");
		Set<Integer> st=lmp.keySet();
		//System.out.println("\t");
		for(Integer s:st)
			//System.out.println("\n");
		System.out.println("\t\n"+lmp.get(s));
		
		System.out.println("====using Collection=====");
		Collection<LinkedHashMapStudent> clmp=lmp.values();	
		for(LinkedHashMapStudent clmpp:clmp)
			System.out.println(clmpp);

		System.out.println("====using EntrySet=====");
		
		Set<Entry<Integer,LinkedHashMapStudent>>e1=lmp.entrySet();
		for(Entry<Integer, LinkedHashMapStudent> ll:e1){
			//System.out.println("\t\n"+ll.getKey()+" "+ll.getValue());
			
			System.out.println("\n***"+ll.getKey());
		
		System.out.println("\t>>>"+ll.getValue());
		}
	}

	

}
