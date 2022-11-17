package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		System.out.println("=====Exception=====");

		// InputMismatchException -> 입력값과 변수의 타입 불일치

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수값 : ");
			int num1 = sc.nextInt();
			System.out.println(num1);

			System.out.println("성공");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("예외처리");
		} finally {
			System.out.println("기본적으로 실행");
		}

		System.out.println("정상 실행");

	}
}
