package com.javabykiran.ListofCountrynState;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.javabykiran.Map.LinkedHashMapStudent;

public class MainCountryState2 {
	public static void main(String[] args) {

		ArrayList<String> mh = new ArrayList<String>();
		mh.add("Pune");		mh.add("Nagpur");		mh.add("Mumbai");
		ArrayList<String> gj = new ArrayList<String>();
		gj.add("Ahamadabd");		gj.add("Surat");
		ArrayList<String> UP = new ArrayList<String>();
		UP.add("Kanpur");		UP.add("Lakhnaw");

		LinkedHashMap<String, ArrayList> State = new LinkedHashMap<>();
		State.put("Maharashtra", mh);
		State.put("Gujarat", gj);
		State.put("UP", UP);
		
		Map<String, LinkedHashMap> country = new HashMap<>();
		country.put("India", State);
		//country.put("USA", State2);
		//country.put("Aus", State2);
		
		System.out.println("====using set=====");
		System.out.println("###India###");
		Set<String> st = State.keySet();
		for (String s : st)
		{	System.out.println("***"+ s); 
			ArrayList list= State.get(s);
			list.forEach(t->System.out.println("     >>"+t));
			System.out.println();
		}
		

		/*
		 * Set<Entry<String, ArrayList>>e1=State.entrySet(); for(Entry<String,
		 * ArrayList> ll:e1){
		 * 
		 * System.out.println("***"+ll.getKey());
		 * 
		 * System.out.println("\t>>>"+ll.getValue());
		 */
	}

}
