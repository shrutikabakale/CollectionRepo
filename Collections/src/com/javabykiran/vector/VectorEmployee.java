package com.javabykiran.vector;

public class VectorEmployee implements Comparable<VectorEmployee>{		
		
			private long eid;
			private String ename;
			private String doj;
			private double salary;
			
			public VectorEmployee(long eid, String ename, String doj, double salary) {
				super();
				this.eid = eid;
				this.ename = ename;
				this.doj = doj;
				this.salary = salary;
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
			public String toString() {
				return "VectorEmployee [eid=" + eid + ", ename=" + ename + ", doj=" + doj + ", salary=" + salary + "]";
			}

			
			@Override
			public int compareTo(VectorEmployee e) {
				Long s1=this.eid;
				Long s2=e.eid;
				if (s1 > s2)
					return 1;
				else if (s1 < s2)
					return -1;
				else
					return 0;
			}

			
			
			
		

	}



