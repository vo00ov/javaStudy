package org.study.operatorEx;

import java.util.Scanner;

public class Operater1 {

	public static void main(String[] args) {
		System.out.println("산술연산자");
		
//		int num1 = 10;
//		int num2 = 20;
				
		Scanner sc = new Scanner(System.in);	
	
		System.out.println("두 숫자를(정수)를 받아서 연산");
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
	}
}
