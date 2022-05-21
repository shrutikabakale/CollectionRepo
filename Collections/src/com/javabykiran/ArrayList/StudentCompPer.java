package com.javabykiran.ArrayList;

import java.util.Comparator;

public class StudentCompPer implements Comparator<ArrayListStudent>{

	@Override
	public int compare(ArrayListStudent s1, ArrayListStudent s2) {
		return s1.per.compareTo(s2.per);
		
	}

}
