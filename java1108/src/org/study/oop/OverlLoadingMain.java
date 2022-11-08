package org.study.oop;

public class OverlLoadingMain {

	static int num1;
	
	public static void main(String[] args) {
		
		num1 = 100;
		
		OverlLoading1 over1 = new OverlLoading1();
		
		over1.nonStaticMethod();
		
		over1.method1();
		over1.method1(100);
		over1.method1(100, "OverLoading1");
		over1.method("OverLoading1", 100);
		
		System.out.println();
		System.out.println(true);
		System.out.println('c');
		System.out.println(new char[] {'c','a','f','e'});
		System.out.println(1.15);
		System.out.println(10);
		System.out.println(10L);
		System.out.println(new OverlLoading1());
		System.out.println(new String("String1"));
		System.out.println("String2");
		
		
		
		
	}
}
