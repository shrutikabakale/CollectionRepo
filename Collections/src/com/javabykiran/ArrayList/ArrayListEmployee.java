package com.javabykiran.ArrayList;

public class ArrayListEmployee {
	
	
		private long eid;
		private String ename;
		private String doj;
		private double salary;
		public ArrayListEmployee(long eid, String ename, String doj, double salary) {
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
		
		

	}

