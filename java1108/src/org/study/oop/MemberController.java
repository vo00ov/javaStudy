package org.study.oop;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {

		// scanner 이용해서 회원가입 하고 회원가입 정보를 콘솔 출력
		// 아이디, 비밀번호, 나이를 입력하고 -> 콘솔에 id:m11, pw:m11 age:111
		// exit 입력되면 while문을 종료
		// while(true) 조건문(if)
		// 1)회원가입 하겠? 실행>회원가입>출력//실행X > 가입종료
		// 2)close

		Scanner sc = new Scanner(System.in);

		MemberDTO mem = new MemberDTO();

		while (true) {

			System.out.print("가입? (y/n)");

			String yesOrNo = sc.next();

			if (yesOrNo.equals("n")) {
				System.out.println("회원가입 종료");
				break;

			} else if (yesOrNo.equals("y")) {

				System.out.print("아이디 : ");
				mem.setUserId(sc.next());

				System.out.print("비밀번호 : ");
				mem.setUserPw(sc.next());

				System.out.print("나이 : ");
				mem.setAge(sc.nextInt());

				System.out.println("===========================");
				System.out.println("회원가입 성공");
				System.out.println("ID : " + mem.getUserId());
				System.out.println("PW : " + mem.getUserPw());
				System.out.println("나이 : " + mem.getAge());
				System.out.println("===========================");

			} else {
				System.out.println("입력오류");

			}
		}

		sc.close();

	}
}
