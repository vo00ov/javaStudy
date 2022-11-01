package org.study.operatorEx;

public class Operator08 {

	public static void main(String[] args) {
		System.out.println("조건연산자");
		
		int i = 10;
		
		System.out.println("=============================");
		if (i>10) {
			System.out.println("10보다 큽니다.");
		}else {
			System.out.println("10보다 크지 않습니다.");
		}
		
		boolean rs = i>10 ? true : false;
		System.out.println(rs);
		String rs1 = i>10?"10보다 큽니다." : "10보다 크지 않습니다";
		System.out.println(rs1);
	}
}
