package com.javabykiran.ArrayList;

import java.util.ArrayList;

public class MainArrayListEmployee {
	public static void main(String[] args) {
		ArrayListEmployee e1 = new ArrayListEmployee(1, "Shuti", "5th jan", 5000);
		ArrayListEmployee e2 = new ArrayListEmployee(2, "Shreenika", "6th feb", 6000);
		ArrayListEmployee e3 = new ArrayListEmployee(3, "Raghavi", "7th march", 7000);
		ArrayListEmployee e4 = new ArrayListEmployee(4, "Rushi", "8th may", 8000);
		ArrayListEmployee e5 = new ArrayListEmployee(5, "Shlok", "9th june", 9000);

		ArrayList<ArrayListEmployee> emp = new ArrayList<ArrayListEmployee>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		emp.stream().filter(e->e.getSalary()>=6000)
		.filter(e->e.getEname().equals("Shreenika"))
		.forEach(t->System.out.println(t));

		//emp.forEach(System.out::println);
	}

}
