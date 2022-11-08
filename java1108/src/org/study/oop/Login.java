package org.study.oop;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String userId = "m11";
		String userPw = "1111";

		// scanner 이용해서 로그인
		// 저장: userId = "m11", userPw = "1111"
		// 아이디 , 비밀번호를 입력하고
		// 아이디와 비밀번호가 같으면 로그인성공->성공 콘솔에 출력
		// 같지 않으면 로그인실패 -> 다시 로그인 콘솔에 출력
		// while(true) 조건문(if)
		// 1)로그인 하겠? 실행>로그인>출력//실행X > 로그인종료
		// 2)close

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("로그인 하실?(y/n)");
			String yOrN = sc.next();

			if (yOrN.equals("n")) {
				System.out.println("종료");
				break;
			} else if (yOrN.equals("y")) {

				while (true) {

					System.out.print("ID : ");
					String id = sc.next();

					System.out.print("PW : ");
					String pw = sc.next();

					if (id.equals(userId) && pw.equals(userPw)) {
						System.out.println("로그인 성공");
						break;
					} else {
						System.out.println("로그인 실패");
					}
				}
				break;

			} else {
				System.out.println("입력오류");
			}

		}
		sc.close();
	}
}
