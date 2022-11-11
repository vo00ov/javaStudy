package org.study.oop;

import java.util.Scanner;

public class ConstructExMain {
	
	public static void main(String[] args) {
		
		
//		ConstructEx con1 = new ConstructEx();
//		ConstructEx con2 = new ConstructEx(10, 20);	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 : ");
		int n2 = sc.nextInt();
		System.out.println("연산자 : ");
		String op2 = sc.next();
				
		ConstructEx con3 = new ConstructEx(n1, n2, op2);
		
		int num1 = con3.getNum1();
		int num2 = con3.getNum2();
		String op = con3.getOp();
		
		if(op.equals("+")) {
			System.out.println(num1 + num2);
		}else if(op.equals("-")) {
			System.out.println(num1 - num2);
		}else if(op.equals("*")) {
			System.out.println(num1 * num2);
		}else if(op.equals("/")) {
			System.out.println((double)num1 / num2);
		}else if(op.equals("%")) {
			System.out.println(num1 % num2);
		}else {
			System.out.println("입력 오류");
		}
		
		
		
	}
}
