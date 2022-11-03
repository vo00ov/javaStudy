package org.study.loopEx;

import java.util.Scanner;

public class WhileEx07 {

	public static void main(String[] args) {
		System.out.println("while(true)");
		// while(true)이용해서
		// 계산기(+*/-) -> "exit"를 입력하면 while문을 종료
		// 정수 두숫자 입력, 연산자 입력(+-*/) -> Scanner이용
		// 연산자에 따라 연산을 실행
		// ->연산자가 "+" 숫자1+숫자2=두수의 합 -> 콘솔에 출력
		// if~else if, Scanner, 변수2개(정수), String(연산자)1개
		// while(true)사용

		Scanner sc = new Scanner(System.in);

		System.out.println("=====계산기=====");

		while (true) {

			System.out.println("시작:아무키 / 종료:exit");
			String start = sc.nextLine();
			
			System.out.print("숫자를 입력하여 주세요 : ");
			int num1 = sc.nextInt();

			System.out.print(" +, -, *, / ");
			String op = sc.next();

			System.out.print("숫자를 입력하여 주세요 : ");
			int num2 = sc.nextInt();


			int result = 0;

			if (start.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else if (op.equals("+")) {
				result = num1 + num2;
			} else if (op.equals("-")) {
				result = num1 - num2;
			} else if (op.equals("*")) {
				result = num1 * num2;
			} else if (op.equals("/")) {
				result = num1 / num2;
			} else {
				System.out.println("잘못입력");

			}

			System.out.println(num1 + " " + op + " " + num2 + " = " + result);

		}
		sc.close();

	}
}
