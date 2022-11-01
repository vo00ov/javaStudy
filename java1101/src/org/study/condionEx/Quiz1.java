package org.study.condionEx;

import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		System.out.println("총점, 평균, 학점 계산");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double)sum/3;;
		String jumsu = "";
		
		if(avg >= 90 && avg <101 ) {
			jumsu = "A";
		}else if(avg >= 80 && avg < 90) {
			jumsu = "B";
		}else if(avg >= 70 && avg < 80) {
			jumsu = "C";
		}else if(avg >= 60 && avg < 70) {
			jumsu = "D";
		}else if(avg < 60 && avg >= 0 ) {
			jumsu = "E";
			
		}else if(avg>100) {
			System.out.println("잘못입력되었습니다.");
		}else {
			System.out.println("-값이 나올 수가 있을까요?");
		}
		
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("학점 : " + jumsu +"등급 입니다.");
		
		System.out.println("==============");
/*
		if(avg >= 90 && avg <101 ) {
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("학점 : A등급 입니다.");
		}else if(avg >= 80 && avg < 90) {
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("학점 : B등급 입니다.");
		}else if(avg >= 70 && avg < 80) {
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("학점 : C등급 입니다.");
		}else if(avg >= 60 && avg < 70) {
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("학점 : D등급 입니다.");
		}else if(avg < 60 && avg >= 0 ) {
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
			System.out.println("학점 : F등급 입니다. 자퇴하세요 공부로는 성공 못하겠내요");
		}else if(avg>100) {
			System.out.println("잘못입력되었습니다.");
		}else {
			System.out.println("-값이 나올 수가 있을까요?");
		}
*/
		System.out.println("==============");
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
}
