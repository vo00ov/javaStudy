package org.study.oop;

public class OverlLoading1 {
	
	
	public static final String PROJECTNAME = "MQ";
	
	public int num1;
	public static int num2;
	
	public static void staticMethod() {
//		num1 = 100;
		num2 = 200;
		System.out.println("staticMethod");
	}
	
	public void nonStaticMethod() {
		staticMethod();
		num1 = 100;
		num2 = 200;
		System.out.println("nonStaticMethod");
	}

	public void method1() {
		System.out.println("method1");
	}
	
	public void method1(int num1) {
		System.out.println(num1);
	}
	
	public void method1(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
	}
	
	public void method(String name, int num1) {
		System.out.println(name);
		System.out.println(num1);
	}
}
