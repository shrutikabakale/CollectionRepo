package com.javabykiran.Queue;

import java.util.PriorityQueue;

public class MainPriorityQueueStudent {

public static void main(String[] args) {
	PriorityQueueStudent p1=new PriorityQueueStudent(3,"Shruti","MCA");
	PriorityQueueStudent p2=new PriorityQueueStudent(10,"Ram","MSc");
	PriorityQueueStudent p3=new PriorityQueueStudent(167,"Seeta","Bcom");
	
	PriorityQueue<PriorityQueueStudent> pq=new PriorityQueue<PriorityQueueStudent>();
	pq.add(p2);	
	pq.add(p1);	
	pq.add(p3);	
	//pq.forEach(s->System.out.println(s));
	
	//System.out.println(pq.peek());
	/*System.out.println(pq.peek());
	System.out.println(pq.peek());
	System.out.println(pq.peek());*/
	
	//System.out.println("=======");
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	//System.out.println("=======");
	//pq.forEach(s->System.out.println(s));
	
	
}
}
