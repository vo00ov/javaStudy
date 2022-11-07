package org.study.oop;

public class Class1Main {

	public static void main(String[] args) {
		
		System.out.println("static멤버(클래스멤버)");
		
		Class1.title="클래스 멤버";
		Class1.classMethod();
//		Class1.PROJECTNAME="final 변경불가";
		
		System.out.println(Class1.PROJECTNAME);
		
		Class1 c1 = new Class1();
		c1.name = "m1";
		c1.age = 20;
		c1.title = "title";
		c1.instanceMethod();
		
		
	}
}
