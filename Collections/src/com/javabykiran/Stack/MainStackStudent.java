package com.javabykiran.Stack;

import java.util.Stack;

public class MainStackStudent {

public static void main(String[] args) {
	StackStudent s1=new StackStudent(3,"Shruti","MCA");
	StackStudent s2=new StackStudent(10,"Ram","MSc");
	StackStudent s3=new StackStudent(167,"Seeta","Bcom");
	
	Stack<StackStudent> ss=new Stack<StackStudent>();
	ss.push(s1);
	ss.push(s2);
	ss.push(s3);
	
	//ss.add(s2);
	//ss.add(s3);
	//ss.add(s1);
	
	//ss.forEach(s->System.out.println(s));
	//ss.addElement(s3);
	
	//ss.peek();
	
	/*
	System.out.println(ss.pop());
	System.out.println(ss.pop());
	System.out.println(ss.pop());
	*/
	Stack<Integer> stackk=new Stack<>();
	stackk.push(10);
	stackk.push(20);
	stackk.push(30);
	int n=stackk.size();
	for(int i=0;i<n;i++) //i=0<3 , i=1<2,  i=2<1
	{
		System.out.println("stackk.size() >>"+stackk.size());
		System.out.println("now top of the element is >>"+stackk.peek());
		System.out.println("deleted:- >>"+stackk.pop());
	}
	System.out.println(stackk.size());
	//ss.forEach(s->System.out.println(s));
	
	
	
	
	
}
}

