package org.study.loopEx;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {
		System.out.println("do~whie");

//		int i = 1;
//
//		do {
//
//			i++;
//			System.out.println(i + "단입니다.");
//
//			int j = 0;
//
//			do {
//
//				j++;
//				System.out.println(i + " * " + j + " = " + i * j);
//
//			} while (j < 9);
//
//		} while (i < 9);

		// 시작단 , 끝단 입력 받아서 시작부터 ~끝단까지 구구단을 콘솔에 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 단 : ");
		int num1 = sc.nextInt();

		System.out.print("끝 단 (첫 단 보다 커야할 것) : ");
		int num2 = sc.nextInt();

		if (num2 > num1) {

			do {

				System.out.println(num1 + "단입니다.");

				int i = 0;

				do {
					i++;
					System.out.println(num1 + " * " + i + " = " + num1 * i);
				} while (i < 9);

				num1++;

			} while (num1 <= num2);
		} else {
			System.out.println("잘못입력");
		}
		sc.close();
	}
}
