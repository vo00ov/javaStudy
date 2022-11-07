package org.study.oop;

public class ClassBasicMain {

	// main -> 메서드
	// 접근지정자 static(클래스메서드) 반환타입 main(String [] args)
	public static void main(String[] args) {
					
					// 객체생성연산자 -> 주소생성
					// new -> 인스턴스화(객체)
		ClassBasic c1 = new ClassBasic();
		// c1 -> 객체참조변수 -> 객체
		c1.userId = "m111";
		c1.userPw = "1111";
		c1.age = 20;
		
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println("id : " + c1.userId);
		System.out.println("pw : " + c1.userPw);
		System.out.println("age : " + c1.age);
		
		
		
		System.out.println("=================================");
		// ClassBasic 타입에 객체를 생성하고 c2(객체참조변수)를
		// 이용해서, userId -> : "s111", userPw ->"22222", age=30 
		// 콘솔에 출력
		
		ClassBasic c2 = new ClassBasic();
		System.out.println(c2);
		System.out.println(c2.getClass());
		
		c2.userId = "s111";
		c2.userPw = "22222";
		c2.age = 30;

		System.out.println("id : " + c2.userId);
		System.out.println("pw : " + c2.userPw);
		System.out.println("age : " + c2.age);
	}
}
