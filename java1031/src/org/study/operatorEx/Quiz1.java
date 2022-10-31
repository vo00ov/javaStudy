package org.study.operatorEx;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * Scanner를 이용해서 정수를 입력받아서 홀짝프로그램을 수행하시오.
		 * Scanner, if문, 산술연산자....
		 * 출력값이 "짝수입니다","홀수입니다" 으로 출력
		 */
		System.out.println("정수(양의정수)를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
	
		if(number%2 == 0 && number != 0) {
			System.out.println("짝수입니다");
		}else if(number%2 == 1) {
			System.out.println("홀수입니다");
		}else if(number < 0) {
			System.out.println("음수입니다 다시 입력해주세요");
		}else if(number == 0) {
			System.out.println("0입니다");
		}
	}
}
