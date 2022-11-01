package org.study.operatorEx;

import java.util.Scanner;

public class Operator09 {
	
	public static void main(String[] args) {
		
		System.out.println("비트연산자");
		
//		System.out.println(1&1);
//		System.out.println(1&0);
//		System.out.println(0&1);
//		System.out.println(0&0);
//		System.out.println(10&12);		
//		System.out.println(Integer.toBinaryString(10&12));	// 	2진수 숫자로 나타내기 위한 매서드 integer.toBinaryString();
//		System.out.println(10|12);
//		System.out.println(10^12);
//		System.out.println(~10);
//		
//		
//		int i1 = 10;
//		int i2 = 0b111;	//	2진수
//		int i3 = 0111;	//	8진수
//		int i4 = 0xaaa;	//	16진수
		
//		System.out.println("i1=" + i1 + ", i2=" + i2 + ", i3=" + i3 + ", i4=" + i4);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 >");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 >");
		int num2 = sc.nextInt();
		
		System.out.print("수행할 연산자 입력. (&, |, ^)");
		String op = sc.next();
		
		if(op.equals("&")) {
			String bi = Integer.toBinaryString(num1 & num2);
			System.out.println(num1 + num2);
			System.out.println(num1 & num2);	// 10진수
			System.out.println(bi);				// 2진수 문자열
		}else if(op.equals("|")) {
			String bi = Integer.toBinaryString(num1 | num2);
			System.out.println(num1 + num2);
			System.out.println(num1 | num2);
			System.out.println(bi);
		}else if(op.equals("^")) {
			String bi = Integer.toBinaryString(num1 ^ num2);
			System.out.println(num1 + num2);
			System.out.println(num1 ^ num2);
			System.out.println(bi);
		}else {
			System.out.println("잘못입력 오류");
		}
		
		sc.close();
		
		
	}
}
