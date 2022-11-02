package org.study.condionEx;

import java.util.Scanner;

public class SwitchEx01 {
	
	public static void main(String[] args) {
		System.out.println("switch");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("key 값 입력 : ");
		int key = sc.nextInt();
		
		switch(key) {
		case 1 : 
			System.out.println("관리자 권한");
			break;
		case 2 :
			System.out.println("중간관리자 권한");
			break;
		case 3 :
			System.out.println("일반사원 권한");
			break;
		default:
			System.out.println("접속 불가 . 관리자에게 문의");
		}
		
		sc.close();
	}
}
