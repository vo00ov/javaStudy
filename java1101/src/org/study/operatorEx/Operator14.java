package org.study.operatorEx;

import java.util.Scanner;

public class Operator14 {
	
	public static void main(String[] args) {
		
		System.out.println("아스키 코드");
		
//		char c1 = 'a';
//		int c1_int = 'A';
//		
//		System.out.println(c1 + ", " + c1_int);
//		System.out.println('a'+26);
//		System.out.println((char)('a'+25));
//		System.out.println('z');
//		System.out.println('A');
//		System.out.println('Z');
//		System.out.println('a' + 'A');
//		System.out.println('z' + 'Z');
//		
//		System.out.println("대문자 -> 소문자");
//		System.out.println('A');
//		System.out.println('A' + 32);
//		System.out.println((char)('A' + 32));
//		
//		System.out.println("소문자 -> 대문자");
//		System.out.println('a');
//		System.out.println('a' - 32);
//		System.out.println((char)('a'-32));
		
		System.out.print("대문자 입력 (A~Z) : " );
		Scanner sc = new Scanner(System.in);
				//Scanner에서 char형 입력
		char ch = sc.next().charAt(0);
//		int ch = sc.next().charAt(0);
		System.out.println("ch -> " + ch);
		System.out.println("ch -> " + (ch + 32));
		System.out.println("ch -> " + (char)(ch + 32));
	}
}
