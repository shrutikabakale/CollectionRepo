package com.javabykiran.SortObject;

public class TreeSetStudent implements Comparable{
	//public class Student implements Comparable<Student>{
	int id;
	String name;
	String course;
	float per;
	public TreeSetStudent(int id, String name, String course, float per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	/*public int compareTo(Student s) 
	{
		if(this.id>s.id)
		return 1;
	else if(this.id<s.id)
		return -1;
	else 
		return 0;
				
	}*/
	/*public int compareTo(Object o) 
	{
	Student t=(Student)o;
	if(this.id>t.id)
		return 1;
	else if(this.id<t.id)
		return -1;
	else 
		return 0;
				
	}*/
	
	public int compareTo(Object o){
	 TreeSetStudent s=(TreeSetStudent)o;
	 String s1=this.name;
	 String s2=s.name;
	 return s1.compareTo(s2);
	}
	

}
