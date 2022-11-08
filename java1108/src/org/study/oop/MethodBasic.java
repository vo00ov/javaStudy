package org.study.oop;

public class MethodBasic {

	//메서드
	//인스턴스 메서드
	
	public String userId;
		
	public void method0() {
		userId="m1111";
		System.out.println("id : " + userId);
	}
	
	//클래스 메서드
	public static void classMethod() {
//		userId = "m222";
//		int i = 10;
		System.out.println("클레스 메서드");
	}
	
	public void method1() {
		System.out.println("반환X, 매개X, method1");
//		return;	// 생략가능
	}
	
	public int method2() {
		int num1 = 10;
		int num2 = 20;
		System.out.println("반환O, 매개X, method2");
		return num1 + num2;
	}
	
	public void method3(int num1, int num2) {
		System.out.println("반환 X, 매개O, method3");
		System.out.println(num1 + " + " + num2 + " = " + ( num1 + num2 ));
//		return ;
	}
	
	public int method4(int num1, int num2) {
		System.out.println("반환 O, 매개O, method4");
		System.out.println(num1 + " + " + num2 + " = " + ( num1 + num2 ));
		return num1+num2;
	}
	
}
