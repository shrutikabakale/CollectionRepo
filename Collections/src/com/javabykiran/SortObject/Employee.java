package com.javabykiran.SortObject;

public class Employee implements Comparable {
	private long eid;
	private String ename;
	private String doj;
	private double salary;

	public Employee(long eid, String ename, String doj, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.doj = doj;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", doj=" + doj + ", salary=" + salary + "]";
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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
	public int compareTo(Object o) {
		Employee t = (Employee) o;
		/*1. way
		 * if (this.eid >t.eid) return 1; else if (this.eid < t.eid) return -1;
		 * else return 0;
		 */

		/*2.way
		 * Long s1=this.eid; Long s2=t.eid; return s1.compareTo(s2);
		 */
//3.way
		/*Long s1 = this.eid;
		Long s2 = t.eid;

		if (s1 > s2)
			return 1;
		else if (s1 < s2)
			return -1;
		else
			return 0;*/
		
		return this.eid > t.eid ? 1 :this.eid < t.eid ? -1 : 0;
	}

}
