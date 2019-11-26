package org.whrhs.dlamson.eleven.pro.ch5;

public class BuildIt {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("butt");
		for(int i = 0; i < 10; i++) {
			sb.insert((int)(Math.random()*5), "butt");
			System.out.println(sb);
		}
		
		System.out.println("bitwise");
		int n = 42;
		System.out.println(Integer.toBinaryString(n));
		n = ~ n;
		System.out.println(Integer.toBinaryString(n));
		System.out.println("n = " + n);
		
		int i = 1;
		i = i++;
		System.out.println(i);
		
		int a = 2;
		int b = 5;
		// 2 * 5 * (2 - 4) * 3 * 4
		int c = a * b * (a++ - --b) * a * b;
		System.out.println("c: " + c);
		
	}
}
