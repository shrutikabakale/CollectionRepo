package com.javabykiran.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class MainHashMapEmployee {
	public static void main(String[] args) {
		Map<Object,HashMapEmployee> mp=new HashMap<Object,HashMapEmployee>();
		//Map<Integer,HashMapEmployee> mp=new HashMap<Integer,HashMapEmployee>();
		
		HashMapEmployee h1=new HashMapEmployee(1, "sheeta", "5th jan",20000);
		HashMapEmployee h2=new HashMapEmployee(88, "Shruti", "10th jan",50000);
		HashMapEmployee h3=new HashMapEmployee(39,"renu", "28th jan",205600);
		HashMapEmployee h4=new HashMapEmployee(7, "meetai", "5th feb",10000);
		HashMapEmployee h5=new HashMapEmployee(5, "ram", "17th march",30000);

	mp.put(22, h1);
	mp.put(10, h3);
	mp.put(88, h3);
	mp.put(90,h4);
	mp.put("aa", h5);
	mp.put("bb", null);
	//mp.put("5", h5);
	//mp.put("42", null);
	mp.put(34, null);
	mp.put(10, h1);
	mp.put(10,h2);
	
	
	//System.out.println(mp.size());


	Set<Object> st=mp.keySet();
	
	for(Object k:st){
		
		System.out.println(mp.get(k));
	}
/*Set<Integer> st=mp.keySet();
	
	for(Integer k:st){
		
		System.out.println(mp.get(k));*/
	
		/*System.out.println("===using values===");
		
		Collection<HashMapEmployee> hme=mp.values();
		for (HashMapEmployee h:hme)
		System.out.println(h);
		
		System.out.println("===using entrySet===");
		
		Set<Entry<Integer,HashMapEmployee>>eh=mp.entrySet();
		for(Entry<Integer,HashMapEmployee> e:eh){
			
			System.out.println(e.getKey()+ "  "+e.getValue());
		
		}*/
			System.out.println("===using forEach===");
			
			mp.forEach((k,v)->System.out.println(k+ " "+v));
		}
		
		
	
	
	
	
}
	
