package com.javabykiran.CollectionArray;

public class EmployeeProcessor {
	static void calAvgSalary(Employee emp[]){
		
		double avgsalary=0.0f;
		
		for(Employee e:emp){
			
			avgsalary=avgsalary+e.getSalary();
		}
		System.out.println(avgsalary/emp.length);
	} 

}
