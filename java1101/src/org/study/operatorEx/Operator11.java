package org.study.operatorEx;

import java.util.Scanner;

public class Operator11 {
	
	public static void main(String[] args) {
		
		System.out.println("삼항 연산자");
		System.out.print("숫자 입력 : " );
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		int num = 10;
		
		int result = num>10?1:0;
		System.out.println("결과값 : " + result);

		boolean bool = num > 10? true : false;
		System.out.println("결과 : " + bool);
		
		String str = num > 10 ? "10보다 크다." : "10보다 크지 않다";
		System.out.println("결과 : " + str);
		
		if(num > 10) {
			System.out.println("10보다 크다");
		}else {
			System.out.println("10보다 크지 않다");
		}
		
		sc.close();
	}
}
