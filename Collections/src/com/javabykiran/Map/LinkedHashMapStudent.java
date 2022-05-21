package com.javabykiran.Map;

public class LinkedHashMapStudent {
	private int id;
	private String name;
	private String course;
	public LinkedHashMapStudent(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "LinkedHashMapStudent [id=" + id + ", name=" + name + ", course=" + course + "]";
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
	
	

}
