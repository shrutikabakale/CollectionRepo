package com.javabykiran.ArrayList;

import java.util.Comparator;

public class StudentCompareId implements Comparator<ArrayListStudent>{

	@Override
	public int compare(ArrayListStudent s1,ArrayListStudent s2) {
	
		if(s1.id>s2.id)
		return 1;
		else if(s1.id<s2.id)
			return -1;
		else
			return 0;
	}

}
