package org.study.controller;

import java.util.Scanner;

import org.study.commend.ExcuteQueryCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectAgeDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {

		System.out.println("CRUD");

		Scanner sc = new Scanner(System.in);
		ExcuteQueryCommend ex = null;

		while (true) {
			System.out.print("Query(insert,select,update,delete)/(exit = 종료)");
			String query = sc.next();

			if (query.equals("insert")) {
				ex = new MemberInsertDo();
				ex.excuteCommned();
			} else if (query.equals("select")) {
				ex = new MemberSelectDo();
				ex.excuteCommned();
			} else if (query.equals("selectAge")) {
				ex = new MemberSelectAgeDo();
				ex.excuteCommned();
			} else if (query.equals("update")) {
				ex = new MemberUpdateDo();
				ex.excuteCommned();
			} else if (query.equals("delete")) {
				ex = new MemberDeleteDo();
				ex.excuteCommned();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("입력 오류");
			}

		}
	}
}
