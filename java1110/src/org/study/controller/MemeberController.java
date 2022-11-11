package org.study.controller;

import java.util.Scanner;

import org.study.commend.DBQueryCommend;
import org.study.commend.MemberDeleteCommend;
import org.study.commend.MemberInsertCommend;
import org.study.commend.MemberSelectCommend;
import org.study.commend.MemberUpdateCommend;

public class MemeberController {

	public static void main(String[] args) {

		// Scanner 이용, while(true)
		// query -> insert면 콘솔에 "회원가입 Commend"
		// query -> delete면 콘솔에 "회원삭제 Commend"
		// query -> update면 콘솔에 "회원수정 Commend"
		// query -> select면 콘솔에 "회원조회 Commend"
		// query -> exit면 콘솔에 "종료"
		// query -> 나머지면 "입력오류"

		// 다형성 이용해서 DBQueryCommned(부모타입)의 참조 변수를 이용
		// 상속을 통해서 excuteQueryCommend() 오버라이드 해서
		// 서브(자식)클래스를 객체를 이욯해서 구현 하시오.

		Scanner sc = new Scanner(System.in);

		DBQueryCommend action = null;

		String query = "";

		while (true) {

			System.out.print("실행 하시겠습니까? (y/n)");
			String yn = sc.next();

			if (yn.equals("n")) {
				System.out.println("종료합니다.");
				break;

			} else if (yn.equals("y")) {

				while (true) {
					
					System.out.print("쿼리문을 입력하세요 ((insert, select, update, delete) / exit = 종료 ) : ");
					query = sc.next();

					if (query.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					} else if (query.equals("insert")) {
						action = new MemberInsertCommend();
						action.excuteQuery();
					} else if (query.equals("select")) {
						action = new MemberSelectCommend();
						action.excuteQuery();
					} else if (query.equals("update")) {
						action = new MemberUpdateCommend();
						action.excuteQuery();
					} else if (query.equals("delete")) {
						action = new MemberDeleteCommend();
						action.excuteQuery();
					} else {
						System.out.println("잘못된 입력값입니다.");
						continue;
					}
				}
			} else {
				System.out.println("잘못된 입력");
			}

		}
	}
}
