package com.javabykiran.Stack;

public class StackStudent {
	
			private int id;
			private String name;
			private String course;
			
			public StackStudent(int id, String name, String course) {
				// TODO Auto-generated constructor stub
				super();
				this.id = id;
				this.name = name;
				this.course = course;
			}
			@Override
			public String toString() {
				return "StackStudent [id=" + id + ", name=" + name + ", course=" + course + "]";
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getCourse() {
				return course;
			}
			public void setCourse(String course) {
				this.course = course;
			}
			/*@Override
			public int compareTo(Object o) {
				StackStudent s=(StackStudent)o;
				Integer s1=this.id;
				Integer s2=s.id;
				if(s1>s2)
					return -1;
				else if (s1<s2)
				return 1;
				else
				return 0;
			}*/
			
			

		}


