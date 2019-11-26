package org.whrhs.dlamson.eleven.ch6;

public class Exercises {
	
	public static void main(String[] args) {
		
		String str = "7" + 5 + 10;
		String guess = "7510";
		System.out.println(guess + " : " + str);
		
		str = 7 + 5 + "10";
		guess = "1210";
		System.out.println(guess + " : " + str);
		
		str = "7" + (5 + 10);
		guess = "715";
		System.out.println(guess + " : " + str);
		
		int m = 50;
		int n = ++m; // n = 51, m = 51
		int o = m--; // o = 51, m = 50
		int p = --o + m--; // p = 50 + 50 = 100, o = 50, m = 49
		int x = m < n ? n < o ? o < p ? p:o:n:m;
		    // 49 < 51 ? 51 < 50 ? 50 < 100 ? 100 : 50 : 51 : 49
		    // 49 < 51 ? 51 < 50 ? 100 : 51 : 49
		    // 49 < 51 ? 51 : 49
		    // 51
		guess = "51";
		System.out.println(guess + " : " + x);
		
		int k = 4;
		boolean flag = k++ == 5;
		flag = !flag;
		guess = "true";
		System.out.println(guess + " : " + flag);
		
		byte b = 1; // 0000 0001
		b = (byte) (b << 1); // 0000 0010
		int c = b << 1;
		byte d = 2;
		d += b;
		byte e = 0;
		guess = "2";
		System.out.println(guess + " : " + b);
		
		String s = "a";
		String[] sa = {"a", s, s.substring(0, 1), new String("a"), "" + 'a'};
		for(int i = 0; i < sa.length; i++) {
			System.out.println(i);
			System.out.println(sa[i] == s); //true true false true
			System.out.println(sa[i].equals(s)); // true true true true
		}
	}

}
