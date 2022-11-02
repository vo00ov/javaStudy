package org.study.condionEx;

import java.util.Scanner;

public class CaculatorEx01 {

	public static void main(String[] args) {
		
		System.out.println("==Caculator==");
		/* int형 두 수를 Scanner클래스에 입력해서 변수에 저장하고
		 * 산술연산자를 Scanner 클래스를 이용하여 입력받아
		 * 연산에 따라 계산하여 결과값 콘솔에 표시하는 프로그램을 만들어 보세요
		 * 
		 * 조건문(if~else)
		 * 변수입력값(2개) -> num1 num2
		 * 변수 연산자 -> String op
		 * 예) -<콘솔에 -> "5 + 10 + 15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번재 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요 (+, -, *, /) ");
		String op = sc.next();
		
		double result = 0;
		
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("*")) {
			result = num1 * num2;
		}else if(op.equals("/")) {
			result = (double)num1 / num2;
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		System.out.println(num1  + " " + op + " " + num2 + " = " + result);

		sc.close();
	}
}
