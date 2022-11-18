package org.study.innerclass;

interface A {
	void ab1();
}

class A1 implements A {
	@Override
	public void ab1() {
		System.out.println("오버라이딩ab1");
	}
}

public class AnonymousClass1 {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.ab1();
		
		// 익명클래스 new 부모();{}
		new A() {
			@Override
			public void ab1() {		
				System.out.println("오버라이딩2");
			}
			
		};
		
	}
}
