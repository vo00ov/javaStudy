package org.study.condionEx;

import java.util.Scanner;

public class Ifex3 {
	
	public static void main(String[] args) {
		System.out.println("조건이 하나 일때");
		/*
		 * 아이디, 비밀번호를 입력받아서 
		 * 아이디와 비밀번호가 일치하면 로그인 성공
		 * 하나라도 틀리면 로그인 실패 콘솔에 출력
		 */

		
		String id = "m111";
		String pw = "1111";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		String userId = sc.next();
		System.out.print("PW : ");
		String userPw = sc.next();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}

		System.out.println("종료");
		sc.close();
	}
}
