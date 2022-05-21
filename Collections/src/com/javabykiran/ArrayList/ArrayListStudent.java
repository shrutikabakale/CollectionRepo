package com.javabykiran.ArrayList;

public class ArrayListStudent{

	int id;
	String name;
	String per;
	String dept;

	public ArrayListStudent(int id, String name, String per, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "ArrayListStudent [id=" + id + ", name=" + name + ", per=" + per + ", dept=" + dept + "]";
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

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((per == null) ? 0 : per.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListStudent other = (ArrayListStudent) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (per == null) {
			if (other.per != null)
				return false;
		} else if (!per.equals(other.per))
			return false;
		return true;
	}

	/*@Override
	public int compareTo(Object o) {

		ArrayListStudent al = (ArrayListStudent) o;
		if (this.id > al.id)
			return 1;
		else if (this.id < al.id)
			return -1;
		else
			return 0;
	}*/

}
