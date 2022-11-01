package org.study.operatorEx;

import java.util.Scanner;


public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * 대문자를 입력 받아서 소문자로 변경
		 * 소문자를 입력 받아서 대문자로 변경
		 * Scanner, .next().charAt(0)
		 */
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("대문자를 입력 하세요 : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("대문자 -> 소문자 : " + (char)(ch1+32));			

		System.out.println("소문자를 입력 하세요 : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("소문자 -> 대문자 : " + (char)(ch2-32));
		
	}
}
