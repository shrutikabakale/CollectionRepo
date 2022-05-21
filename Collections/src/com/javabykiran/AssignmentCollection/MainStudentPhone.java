package com.javabykiran.AssignmentCollection;

import java.util.ArrayList;

public class MainStudentPhone {
	public static void main(String[] args) {
		ArrayList<Student>als=new ArrayList<Student>();
		Student s1=new Student(12,"pune",new Phone(232,5656));
		Student s2=new Student(110,"Nagpur",new Phone(762,80756));
		Student s3=new Student(82,"Delhi",new Phone(762,98600));
		Student s4=new Student(19,"Mumbai",new Phone(298,5426));
	als.add(s1);
	als.add(s2);
	als.add(s3);
	als.add(s4);
	for(Student stu:als){
	Phone pp=stu.phone;
	if(pp.cost>50000){
		System.out.println(stu.loc);
		System.out.println(stu.age);
		System.out.println(pp.mobNumber);
		System.out.println(pp.cost);}
		
	}
	
	}

	
}
