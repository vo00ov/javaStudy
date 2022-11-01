package org.study.condionEx;

import java.util.Scanner;

public class Ifex1 {
	
	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		
		System.out.print("ID : ");
		String id = "m111";
		Scanner sc = new Scanner(System.in);
		
		String userId = sc.next();
		
		if(userId.equals(id)) {
			System.out.println("중복 아이디");
		}
		
		if(!userId.equals(id)) {
			System.out.println("중복 아이디가 X");
		}
		
		System.out.println("종료");
		sc.close();
	}
}
