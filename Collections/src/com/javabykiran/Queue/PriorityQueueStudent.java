package com.javabykiran.Queue;

public class PriorityQueueStudent  implements Comparable {
	

		private int id;
		private String name;
		private String course;
		public PriorityQueueStudent(int id, String name, String course) {
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
		@Override
		public int compareTo(Object o) {
			PriorityQueueStudent s=(PriorityQueueStudent)o;
			Integer s1=this.id;
			Integer s2=s.id;
			if(s1>s2)
				return -1;
			else if (s1<s2)
			return 1;
			else
			return 0;
		}
		
		

	}


