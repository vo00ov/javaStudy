package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx2 {
	
	public static void main(String[] args) {
		
		System.out.println("조건 연산자");
		
		String userId = "m111";
		String userPw = "1111";
								//조건1 && 조건2 -> 모든 조건이 true 일때만 true
		System.out.println(userId.equals("m111") && userPw.equals("1111"));
		System.out.println(userId.equals("m111") && userPw.equals("2222"));
		System.out.println(userId.equals("m222") && userPw.equals("1111"));
		System.out.println(userId.equals("m222") && userPw.equals("2222"));
		System.out.println("============================");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("============================");
		
		/*
		 * 아이디, 비밀번호가 동시에 일치하면 "로그인 성공", 그렇지 않으면 "로그인 실패"
		 * 콘솔에 출력
		 * Scnnaer, 아이디 -> id , 비밀번호 -> pw입력을 받아서
		 * userId, userPw와 동시에 일치하는 프로그래밍을 해보세요.
		 * &&, if~else
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		String pw;
		
		System.out.print("아이디 입력 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		pw = sc.nextLine();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else if(!userId.equals(id) && userPw.equals(pw)){
			System.out.println("등록된 계정이 없습니다");
		}else if(userId.equals(id) && !userPw.equals(pw)){
			System.out.println("비밀번호를 다시 확인해주세요");
		}else {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
		}
		
		
		
		
		
	}
}
