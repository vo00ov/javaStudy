package org.study.scannerEx;

import java.util.Scanner;

public class ScannerEx01 {
	
	public static void main(String[] args) {
		
		System.out.println("===Scanner===");
		//프로그래머가 입력
		Scanner sc = new Scanner(System.in);
		//주소를 입력 "서울시 노원구"
		System.out.print("주소를 입력하세요");
		String addr = sc.nextLine();	//입력 문자열 return;
		System.out.println(addr);
		
		//이름을 입력 "공백 X"
		System.out.print("이름을 입력하세요");
		String name = sc.next();
		System.out.println(name);		// 공백 X
		
		//숫자 입력
		System.out.print("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println(age);
		
		//소수점 입력
		System.out.print("당신의 키는 몇?");
		double hei =  sc.nextDouble();
		System.out.println(hei);
		
		sc.close();
	}
}
