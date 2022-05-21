package com.javabykiran.Map;

import java.util.Map;
import java.util.HashMap;

public class HashMapEmployee {
	private int eid;
	private String name;
	private String doj;
	private double salary;
	public HashMapEmployee(int eid, String name, String doj, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "HashMapEmployee [eid=" + eid + ", name=" + name + ", doj=" + doj + ", salary=" + salary + "]";
	}
	}

