package org.study.oop;

public class MethodExMain {

	public static void main(String[] args) {
		
		MethodEx m1 = new MethodEx();
		
		m1.method1();
		
		System.out.println(m1.method2());
		int num1 = m1.method2();
		System.out.println(num1);
		
		System.out.println(m1.method3());
		String str1 = m1.method3();
		System.out.println(str1);
		
		m1.method4(10, 20);
		
		int sum = m1.method5(15, 22);
		System.out.println(sum);
		
		m1.method6(20, 13, "+");
		m1.method6(20, 13, "-");
		m1.method6(20, 13, "*");
		m1.method6(20, 13, "/");
		
	}
}
