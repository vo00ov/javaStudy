package org.study.inheritance;

class Parent {
	public int num1;
	private int num2;
	protected String op;

	public void parentMethod() {
		System.out.println("parentMethod");
	}
}

class Son1 extends Parent {
	public int num3;

	@Override
	public void parentMethod() {
		System.out.println("자식parentMethod");
//		super.parentMethod();
	}
}

class Son2 extends Parent {
	public int num4;

	public void son2Method() {
		System.out.println("son2Method");
	}
}

public class InheritanceBasic {

	public static void main(String[] args) {
		Parent p = new Parent();
		
		Son1 s1 = new Son1();
		s1.parentMethod();
		
		Son2 s2 = new Son2();
		s2.parentMethod();
		
	}
}
