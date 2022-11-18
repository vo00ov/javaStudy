package org.study.innerclass;

public class AnonymousClassMain {

	public static void main(String[] args) {
		//익명클래스 생성
		new Interface1() {
			@Override
			public void excute() {
				System.out.println("익명클래스구현");
			}
		};
		
		new Interface1() {
			
			@Override
			public void excute() {
				System.out.println("익명클래스구현1");
			}
		};
	}
}
