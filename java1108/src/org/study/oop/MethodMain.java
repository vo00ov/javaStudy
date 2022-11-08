package org.study.oop;

public class MethodMain {
	
	public static String userId;
	
	public static final String PROJECT = "PROJECT2022";

	public static void main(String[] args) {
		
		userId = "m111"; // static메서드는 static필드를 사용
		
		MethodBasic m1 = new MethodBasic();
		
		m1.method1();
		
		int sum = m1.method2();
		System.out.println(m1.method2());
		System.out.println(sum);
		
		m1.method3(23, 52);
		
		int sum2 = m1.method4(234, 191);
		System.out.println(sum2);
		
		
	}
}
