package org.stduy.Inheritance;


class A{
	int a;
	public A() {
		System.out.println("A");
	}
	
	public A(String name) {
		System.out.println("다른생성자" + name);
	}
	void a1() {
		System.out.println("a1");
	}
}

class B extends A{
	int b;
	public B() {
		super();	// super class 생성자
		System.out.println("B");
	}
	void b1() {
		System.out.println("b1");
	}
}

class C extends A{
	int c;
	public C() {
		super();	//	자동으로 부모클래스 생성자
		System.out.println("C");
	}
	void c1() {
		System.out.println("c1");
	}
}


public class InheritanceEx {

	public static void main(String[] args) {
		
//		A a1 = new A();
//		B b1 = new B();
		C c1 = new C();
				
		
	}
	
}
