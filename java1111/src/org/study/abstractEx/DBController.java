package org.study.abstractEx;

import java.util.Scanner;

public class DBController {

	public static void main(String[] args) {

		// 부모타입 객체 참조변수
//		SQLQueryCommend delete = new DBDeleteDo();
//		delete.excuteQueryCommend();
//		
//		SQLQueryCommend insert = new DBInsertDo();
//		insert.excuteQueryCommend();
//		
//		SQLQueryCommend select = new DBSelectDo();
//		select.excuteQueryCommend();
//		
//		SQLQueryCommend update = new DBUpdateDo();
//		update.excuteQueryCommend();

		Scanner sc = new Scanner(System.in);

		SQLQueryCommend action = null;

		String sql = "";

		while (true) {
			System.out.println("실행하십니까? (y/n)");
			String yn = sc.next();

			if (yn.equals("n")) {
				System.out.println("프로그램 종료");
				break;

			} else if (yn.equals("y")) {

				while (true) {

					System.out.print("sql문 입력  (종료 exit): ");

					sql = sc.next();

					if (sql.equals("exit")) {
						System.out.println("프로그램 종료");
						break;
					} else if (sql.equals("insert")) {
						action = new DBInsertDo();
						action.excuteQueryCommend();

					} else if (sql.equals("select")) {
						action = new DBSelectDo();
						action.excuteQueryCommend();

					} else if (sql.equals("update")) {
						action = new DBUpdateDo();
						action.excuteQueryCommend();

					} else if (sql.equals("delete")) {
						action = new DBDeleteDo();
						action.excuteQueryCommend();

					} else {
						System.out.println("잘못된 입력");
						continue;
					}
				}
			} else {

				System.out.println("잘못된 입력 !");

			}
		}

		sc.close();
	}
}
