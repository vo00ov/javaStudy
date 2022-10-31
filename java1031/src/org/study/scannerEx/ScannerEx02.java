package org.study.scannerEx;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		System.out.println("==Scanner==");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 정수 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("두번째 숫자 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		
	}
}
