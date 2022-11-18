package org.study.innerclass;

public class InnerClassExMain {
	
	public static void main(String[] args) {
		// 인스턴스화(객체화)			new(객체생성, 객체주소생성)
		// 클래스타입	//inner1 -> 객체참조변수(객체의 주소값이 저장)
		InnerClassEx inner1 = new InnerClassEx();
		
//		내부 클래스 타입 선언					// 내부클래스 생성
		InnerClassEx.InstanceClass2 inC = inner1.new InstanceClass2();
// 		위와 같음
//		new InnerClassEx().new InstanceClass2();
		
		inC.num1 = 100;
		inC.m1();
		
		System.out.println();

		//클래스		내부클래스					클래스		내부클래스
		InnerClassEx.StaticClass2 st = new InnerClassEx.StaticClass2();
		st.method();
		InnerClassEx.StaticClass2.method();
		
		System.out.println();

		//지역클래스
		InnerClassEx inC2 = new InnerClassEx();
		inC2.localMethod();
	}
}
