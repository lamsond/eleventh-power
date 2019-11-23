package org.whrhs.dlamson.eleven.ch3;

public class Person {
	int id;
	String name;
	java.util.Date dob;
	boolean vip;
	
	public static void boxMaker(int a, int b) {
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i < 5; i--) {
			count++;
		}
		System.out.println(count);
		boxMaker(4, 5);
		Person p1 = new Person();
		Person p2 = p1;
		int id = p2.id;
		if(args.length > 0)
			p1.name = args[0];
		
		String vowels = "aeiou";
		for(int i = 1; i >= 0; i--){
		    for(int j = 0; j < 3; j++){
		        if(i % 2 == 0){
		            System.out.print("/\\");
		        }
		        else{
		            System.out.print("\\/");
		        }
		    }
		    System.out.println("");
		}
		
		
		

		System.out.println(vowels.indexOf('a'));
		
		int n = -5;
				if(n % 5 != 0)
				n *= -1;
				if(n>0)
				if(n>=5)
				System.out.print(1);
				else
				System.out.print(2);
				else
				System.out.print(3);
				System.out.print(4);
				System.out.println("");
				for(int i = 1; i < 4; i++){
				    for(int j = 0; j < 3; j++){
				        if(j % i == 0){
				            System.out.print("*");
				        }
				    }
				    System.out.println("");
				            }

	}
	
	public String getName() {
		return name;
	}
}
