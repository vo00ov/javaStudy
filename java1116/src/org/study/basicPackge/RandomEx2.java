package org.study.basicPackge;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		System.out.println("Random");
		
		Random rd = new Random();
		
		// 5번 실행 -> 정수값을 랜덤
		for(int i=0; i<5; i++) {
			System.out.println(rd.nextInt());
		}
		
		System.out.println();
		
		// 5번 실행 -> 1~45
		for(int i=0; i<5; i++) {
			System.out.println(rd.nextInt(45) + 1);
		}
		
		// 5번 실행 -> 랜덤 소수점 두자리(printf)
		System.out.println();
		for(int i=0; i<5; i++) {
//			System.out.println("서식문자", 출력값);
			System.out.printf("%.2f\t", rd.nextDouble());
		}
		
		
	
	}
}
