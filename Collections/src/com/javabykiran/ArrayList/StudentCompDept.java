package com.javabykiran.ArrayList;

import java.util.Comparator;

public class StudentCompDept implements Comparator <ArrayListStudent> {

	@Override
	public int compare(ArrayListStudent s1, ArrayListStudent s2) {
		
		return s1.dept.compareTo(s2.dept);
		 
	}

}
