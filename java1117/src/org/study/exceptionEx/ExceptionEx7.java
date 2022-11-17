package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println("=====Exception=====");

		int num1 = 10;
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.print("숫자 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.println(num2);
			System.out.println(num1/num2);
			System.out.println(arr[5]);
			System.out.println("정상");			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (InputMismatchException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("기본적으로 실행");
		}

		System.out.println("정상 실행");

	}
}
