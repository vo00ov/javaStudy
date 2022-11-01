package org.study.condionEx;

import java.util.Scanner;

public class Ifex5 {
	
	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		// 90이상 A , 95이상이면 A+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int kor = sc.nextInt();
		
		
		if(kor >= 90) {
			if(kor>=95) {
				System.out.println("A+");
			}else{
				System.out.println("A");
			}
		}else if(kor >= 80) {
			if(kor >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else if(kor >= 70) {
			if(kor >= 75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}	
		}else if(kor >=60) {
			if(kor >=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
		}
		}else {
				System.out.println("E");
		}


		System.out.println("종료");
		sc.close();
	}
}
