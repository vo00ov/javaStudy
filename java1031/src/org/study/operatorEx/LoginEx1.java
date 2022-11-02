package org.study.operatorEx;

import java.util.Scanner;

public class LoginEx1 {
	
	public static void main(String[] args) {
		
		/* id, pw를 scanner입력을 받아서
		id가 일치하면 "아이디가 일치합니다"
		pw가 일치하면 "비밀번호가 일치합니다"
		콘솔에 출력하는 프로그램을 만들어 보세요.
		if문(조건1->2개), equals, System.out.print(), Scanner이용
		*/
		
		String userId = "m111";
		String userPw = "1111";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 > ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력하세요 > ");
		String pw = sc.nextLine();
		
		if( userId.equals(id) && userPw.equals(pw)) {
			System.out.println("아이디와 비밀번호가 일치합니다");
		}else if( !userId.equals(id) && userPw.equals(pw)) {
			System.out.println("아이디를 다시 확인해주세요");
		}else if( userId.equals(id) && !userPw.equals(pw)) {
			System.out.println("비밀번호를 다시 확인해주세요");
		}
		else {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
		}
		
		sc.close();
				
	}
}
