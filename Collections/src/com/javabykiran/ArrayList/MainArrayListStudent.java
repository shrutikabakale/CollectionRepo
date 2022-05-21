package com.javabykiran.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MainArrayListStudent {
	public static void main(String[] args) {

		ArrayListStudent s1 = new ArrayListStudent(32, "Shruti", "78.7", "MCA");
		ArrayListStudent s2 = new ArrayListStudent(45, "Shreenika", "79.7", "BE");
		ArrayListStudent s3 = new ArrayListStudent(66, "Raghavi", "84.8", "MTec");
		ArrayListStudent s4 = new ArrayListStudent(87, "Rushi", "89.9", "ME");
		ArrayListStudent s5 = new ArrayListStudent(23, "Piyu", "86.7", "Mcom");

		ArrayList<ArrayListStudent> st = new ArrayList<ArrayListStudent>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);

		System.out.println("====sort by id====");
		StudentCompareId cid = new StudentCompareId();
		st.sort(cid);

		st.forEach(t -> System.out.println(t));

		System.out.println("====sort by name====");
		StudentCompName cName = new StudentCompName();
		st.sort(cName);
		st.forEach(t -> System.out.println(t));

		System.out.println("====sort by per====");

		StudentCompPer cper = new StudentCompPer();
		st.sort(cper);
		st.forEach(t -> System.out.println(t));

		System.out.println("====sort by dept====");

		StudentCompDept cdt = new StudentCompDept();
		st.sort(cdt);

		st.forEach(t -> System.out.println(t));
	}

}
