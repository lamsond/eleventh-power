package org.whrhs.dlamson.eleven.ch3;

public class Person {
	int id;
	String name;
	java.util.Date dob;
	boolean vip;
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = p1;
		int id = p2.id;
		if(args.length > 0)
			p1.name = args[0];
	}
	
	public String getName() {
		return name;
	}
}
