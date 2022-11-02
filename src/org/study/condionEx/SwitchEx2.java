package org.study.condionEx;

import java.util.Scanner;

public class SwitchEx2 {
	
	public static void main(String[] args) {
		System.out.println("switch");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("key 값 입력 : ");
		String key = sc.next();
		
		switch(key) {
		case "a" :
		case "A" :
			System.out.println("A");
			break;
		case "b" :
		case "B" :
			System.out.println("B");
			break;
		case "c" :
		case "C" :
			System.out.println("C");
			break;
			
		default :
			System.out.println("a,A,b,B,c,C 외 알파벳입니다.");
		}
		
		sc.close();
	}
}
