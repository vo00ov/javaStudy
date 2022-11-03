package org.study.loopEx;

import java.util.Scanner;

public class WhileEx06 {

	public static void main(String[] args) {
		System.out.println("while(true)");

		// while(true)이용해서
		// 아이디와 비밀번호가 일치하면 while문을 종료("로그인성공")
		// 일치 하지 않으면 "로그인실패" 출력하고 다시 입력
		// 로그인 성공하면 while문을 종료 하는 프로그램을 작성 하시오.
		// while, if, break, Scanner

		Scanner sc = new Scanner(System.in);

		String dbId = "root";
		String dbPw = "1111";

		while (true) {
			System.out.println("=====로그인창======");
			
			System.out.print("ID : ");
			String userId = sc.nextLine();

			System.out.print("PW : ");
			String userPw = sc.nextLine();

			if (userId.equals(dbId) && userPw.equals(dbPw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패. 다시 로그인 해주세요");
			}
		}

		sc.close();

	}
}
