package org.study.loopEx;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {

		System.out.println("===for문===");

		for (int i = 0; i < 10; i++) {
			// 0,1,2,,,,,9
			if (i < 9) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}

		System.out.println();

		for (int i = 10; i >= 0; i--) {
			if (i == 0) {
				System.out.print(i);
			} else {
				System.out.print(i + ",");
			}
		}

		System.out.println();

		for (int i = 9; i >= 0; i--) {
			if (i == 0) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ",");
		} // break

		System.out.println();
		System.out.println("==================================================");

//		====================================================================

		// Scanner 이용
		// 첫번째 숫자, 두번재 숫자를 입력 받아서
		// 첫번째 숫자부터 두번째 숫자까지 콘솔에 출력
		// 조건이 첫번째 숫자 < 두번째 숫자
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i == num2 - 1) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
			}
		} else {
			System.out.println("첫번째 숫자가 두번째 숫자보다 작아야합니다.");
		}

		sc.close();

	}
}
