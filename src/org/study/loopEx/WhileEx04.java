package org.study.loopEx;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		System.out.println("while");

		System.out.println("구구단");
		/*
		 * Scanner 이용해서, 시작단, 끝단 -> ex)2단, 5단 = 2~5 
		 * 시작단, 끝단 입력을 받아서 콘솔에 출력 
		 * 단. 시작단은 끝단보다작다. 
		 * while문 으로 구현해보세요
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 단 : ");
		int i = sc.nextInt();
		
		System.out.println();
		System.out.println("주의사항 : 첫번째 입력값보다 크게 입력");
		System.out.println();
		
		System.out.print("두번째 단 : ");
		int i2= sc.nextInt();
		
		if(i2>i) {			
			while(i<=i2) {
				System.out.println("=====" + i + "단=====");
				
				int j = 1;
				
				while(j<10) {
					System.out.println(i + " x " + j + " = " + i*j);
					j++;
				}
				i++;
			}
		}else {
			System.out.println("오류");
		}
		
		sc.close();

	}
}
