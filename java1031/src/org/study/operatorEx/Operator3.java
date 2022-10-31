package org.study.operatorEx;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		
		System.out.println("비교연산자");
		
//		int num1 = 10;
//		int num2 = 20;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 :");
		int num1 = sc.nextInt();
		
		System.out.println("두번쨰 :");
		int num2 = sc.nextInt();
		
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		if(num1 > 10) {
			System.out.println("num1은 10보다 큽니다");
		}
		if(num2 > 10) System.out.println("num2는 10보다 큽니다");
		
		
		int age = 11;
		String strAge = "11";
		
		System.out.println(age == 11);
		System.out.println(strAge.equals("11"));
		
		
		sc.close();
	}
}
