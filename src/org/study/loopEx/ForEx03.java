package org.study.loopEx;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {

		System.out.println("===for문===");
		/*
		 * Scanner 이용해서, 시작단, 끝단 -> ex)2단, 5단 = 2~5 
		 * 시작단, 끝단 입력을 받아서 콘솔에 출력 
		 * 단. 시작단은 끝단보다작다. 
		 * for으로 구현해보세요
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 단을 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println();
		System.out.println("시작단보다 높은 숫자를 입력");
	
		System.out.print("두번째 단을 입력해주세요 :  ");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
					System.out.println("====" + i + "단" + "====");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("입력값이 잘못되었습니다.");
		}
		
		sc.close();

	}
}
