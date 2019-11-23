package org.whrhs.dlamson.eleven.pro.ch3;

import java.util.Date;

public class Student {
	private static int count = 0;
	private String studentId;
	
	// static initializer, executes once when class is loaded
	static {
		System.out.println("Student class loaded");
	}
	
	// instance initializer, executes before the constructor during instantiation 
	{
		Student.count++;
		System.out.println("Student count updated: " + count + " students");
	}
	
	public Student(String id) {
		this.studentId = id;
		System.out.println(new Date() + ": student instance created <id: " + id + ">");
	}
	
	public String toString() {
		return "Student[studentId = " + this.studentId + "]";
	}
	
	public static void main(String[] args) {
		Student cora = new Student("a12fb34c56");
		System.out.println("Created Cora [main]");
		
		System.out.println("\ntime to make da...\n");
		
		Student da = new Student("98c34b23a");
		System.out.println("Created Da [main]");
	}
}
