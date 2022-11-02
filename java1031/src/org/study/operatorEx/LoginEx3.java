package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx3 {
	
	public static void main(String[] args) {
		
		System.out.println("조건 연산자");
		
		String userId = "m111";
		String userPw = "1111";
								
		System.out.println(userId.equals("m111") || userPw.equals("1111"));
		System.out.println(userId.equals("m111") || userPw.equals("2222"));
		System.out.println(userId.equals("m222") || userPw.equals("1111"));
		System.out.println(userId.equals("m222") || userPw.equals("2222"));
		System.out.println("============================");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("============================");
		System.out.println(!false);
		System.out.println(!true);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine();
		
		
		//아이디가 틀리거나 비밀번호가 틀리거나
		if(!userId.equals("m111") || !userPw.equals("1111") ){
			System.out.println("로그인실패");
		}else {
			System.out.println("로그인성공");
		}
		
		sc.close();
	}
}
