package com.javabykiran.ListofCountrynState;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import com.javabykiran.Map.LinkedHashMapStudent;

public class MainCountryState {
	public static void main(String[] args) {

		ArrayList<String> mh = new ArrayList<String>();
		mh.add("\nPune");
		mh.add("\nNagpur");
		mh.add("\nMumbai\n");

		// mh.forEach(t -> System.out.println(t));

		ArrayList<String> gj = new ArrayList<String>();
		gj.add("\nAhamadabd");
		gj.add("\nSurat\n");

		// gj.forEach(t -> System.out.println(t));

		ArrayList<String> UP = new ArrayList<String>();
		UP.add("\nKanpur");
		UP.add("\nLakhnaw\n");

		// .forEach(t->System.out.println(t));

		LinkedHashMap<String, ArrayList> State = new LinkedHashMap<String, ArrayList>();
		State.put("Maharashtra", mh);

		State.put("Gujarat", gj);

		State.put("UP", UP);
		/*System.out.println("====using set=====");
		Set<String> st=State.keySet();
		for(String s:st)
		System.out.println(State.get(s));*/
		
	System.out.println("***India***");
		
	Set<Entry<String, ArrayList>>e1=State.entrySet();
	for(Entry<String, ArrayList> ll:e1){
			
		System.out.println("***"+ll.getKey());
	
	System.out.println("\t>>>"+ll.getValue());

	}

	}}
