package org.study.basicPackge;

import java.util.Scanner;

public class StringTokenizerQuiz {

	public static void main(String[] args) {
		
		// String 타입의 변수 userId, userPw, userName
		// scanner클래스를 이용해 초기화 시키고
		// concat(); 문자열 합치는 메서드를 이용

		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String userId = sc.next();
		String userId2 = "userId=".concat(userId);
		System.out.println(userId2);
		
		System.out.print("PW : ");
		String userPw = sc.next();
		String userPw2 = "userPw=".concat(userPw);
		System.out.println(userPw2);
		
		System.out.print("NAME : ");
		String userName = sc.next();
		String userName2 = "userName=".concat(userName);
		System.out.println(userName2);
		
		System.out.println();
		String log = userId2.concat("&").concat(userName2).concat("&").concat(userName2);
		System.out.println(log);
	}
}
