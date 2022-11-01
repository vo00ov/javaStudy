package org.study.condionEx;

import java.util.Scanner;

public class Ifex2 {
	
	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		//점수를 입력해서 90점이상이면 A출력
		//점수를 입력해서 90점이상이면 B출력
		//점수를 입력해서 90점이상이면 C출력
		//점수를 입력해서 90점이상이면 D출력
		//점수를 입력해서 90점이상이면 F출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int kor = sc.nextInt();
		
		
		if(kor>=90) {
			System.out.println("A"); 		//90이상일때
		}
		if(kor>=80 && kor<90) {
			System.out.println("B");		//80이상 90미만
		}
		if(kor>=70 && kor<80) {
			System.out.println("C");		//70이상 80미만
		}
		if(kor>=60 && kor<70) {
			System.out.println("D");		//60이상 70미만
		}
		if(kor<60) {						//70미만
			System.out.println("F");
		}

		
		System.out.println("종료");
		sc.close();
	}
}
