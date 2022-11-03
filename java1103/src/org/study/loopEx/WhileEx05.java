package org.study.loopEx;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		System.out.println("while(true)");
		// 숫자 0이 입력되면 while문을 종료

		Scanner sc = new Scanner(System.in);
		System.out.println("0 입력시 종료");

		while (true) {

			System.out.print("입력 : ");
			int i = sc.nextInt();

			if (i == 0) {
				System.out.println("종료");
				break; // 조건이 true이면 반복문을 종료
			}

		}//break

		sc.close();
	}
}
