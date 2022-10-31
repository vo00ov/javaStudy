package org.study.operatorEx;

import java.util.Scanner;

public class QuizEx01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 정수 : ");
		double num1 = sc.nextDouble();
		System.out.print("두번재 정수 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("연산자를 입력하세요 : (+ , - , * , / , %) ");
		String ss = sc.next();
		
		if(ss.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}else if(ss.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}else if(ss.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		}else if(ss.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}else if(ss.equals("%")) {
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		}else {
			System.out.println("잘못입력했다.");
		}
		
		sc.close();
		
	}
}
