package org.study.abstractEx;


public class Abstract1Main {

	public static void main(String[] args) {
		
		Abstract1Sub1 a1 = new Abstract1Sub1();
		a1.abstractM1();
		a1.abstractM2("추상메서드2");
		
		System.out.println();
		
		Abstract1Sub1SubSub a2 =new Abstract1Sub1SubSub();
		a2.abstractM1();
		a2.abstractM2("아 어렵다");
		a2.abstractM3();
		
		
		// 부모타입 -> 자식 객체
		// 다형성
		Abstract1 a = new Abstract1Sub1SubSub();
		a.num1 = 10;
		a.abstractM1();
		a.abstractM2("이해하기가 너무 어렵다");
		a.m1();
		
		
//		//구현 객체간의 상속관계 없으면 다형성이 성립하지 않는다.
//		Abstract1Sub1 aa = new Abstract1Sub1SubSub();

	}
}
