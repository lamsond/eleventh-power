package org.whrhs.dlamson.eleven.ch6;

public class PrecedenceTest {
	static boolean a, b, c;
	
	public static void main(String[] args) {
		
		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.println(a + ", " + b + ", " + c);
	}
}
