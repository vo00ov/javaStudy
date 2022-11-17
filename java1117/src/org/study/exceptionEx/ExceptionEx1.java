package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		System.out.println("=====Exception=====");

		// Scanner 정수를 입력을 받아서 num1을 나누어
		// 결과를 출력

		int num1 = 100;

		try {
			// 예외가 발생 할 것 같은 명령문
			Scanner sc = new Scanner(System.in);

			System.out.print("나누는 숫자를 입력 : ");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println(result);
			System.out.println("정상실행");

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외처리");
		} finally {
			System.out.println("예외와 상관없이 실행");
		}

		System.out.println("정상 실행");

	}
}
