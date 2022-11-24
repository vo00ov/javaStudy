package org.study.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dto.MemberDto2;

public class MemberDto2Controller {

	public static void main(String[] args) {
		System.out.println("=======Quiz========");
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDto2> mDto = new ArrayList<MemberDto2>();

		while (true) {

			System.out.print("1.회원가입  0.종료");
			String start = sc.next();

			if (start.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			} else if (start.equals("1")) {

				System.out.println("회원가입");

				System.out.print("ID : ");
				String userId = sc.next();
				System.out.print("EMAIL : ");
				String email = sc.next();
				System.out.print("PHONE : ");
				String phone = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();

				mDto.add(new MemberDto2(userId, email, phone, age));

			} else {
				System.out.println("입력값 오류");
			}
		}

		System.out.println("==========회원 명단=============");
		
		int no = 1;

		for (MemberDto2 i : mDto) {
			System.out.print(no + ". ");
			System.out.print("아이디:" + i.getUserId() + " ");
			System.out.print("이메일:" + i.getEmail() + " ");
			System.out.print("전화번호:" + i.getPhone() + " ");
			System.out.print("나이:" + i.getAge() + "\n");

			no++;

		}
		System.out.println("=============================");

		boolean log = false;
		while (!log) {

			System.out.println("로그인");

			System.out.print("id:");
			String logId = sc.next();

			System.out.print("email:");
			String logEmail = sc.next();

			for (MemberDto2 a : mDto) {
				String userid = a.getUserId();
				String useremail = a.getEmail();

				if (userid.equals(logId) && useremail.equals(logEmail)) {
					System.out.println("login 성공");
					log = true;
					break;
				} else {
					System.out.println("login 실패");
				}

			}

		}

	}
}
