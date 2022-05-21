package com.javabykiran.ArrayList;

import java.util.Comparator;

public class StudentCompName implements Comparator<ArrayListStudent> {

	@Override
	public int compare(ArrayListStudent s1, ArrayListStudent s2) {
		 return s1.name.compareTo(s2.name);

}
}
