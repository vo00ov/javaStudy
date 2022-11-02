package org.study.loopEx;

public class ForEx02 {

	public static void main(String[] args) {

		System.out.println("===for문===");

		System.out.println("구구단1");
		// 2~9단
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				// 2*1=2
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

		System.out.println("==================");

		System.out.println("구구단2");
		// 9단부터 2단까지 for문을 이용해서 구현

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}
}
