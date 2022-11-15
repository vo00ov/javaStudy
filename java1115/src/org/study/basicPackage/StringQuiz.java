package org.study.basicPackage;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String start = "/";
		String end = ".do";

		while (true) {

			System.out.println("실행? (y/n)");
			String yn = sc.next();

			if (yn.equals("n") || yn.equals("N")) {
				System.out.println("종료");
				break;
			} else if (yn.equals("y") || yn.equals("Y")) {

				while (true) {

					System.out.print("쿼리문 입력 ((insert,select,,, / exit = 종료)");
					String query = sc.next();
					query = start.concat(query).concat(end);

					String url = query.substring(0, query.length() - 3);

					if (query.substring(query.length() - 3).equals(".do")) {

						if (url.equals("/insert")) {
							System.out.println("회원가입 실행");
						} else if (url.equals("/select")) {
							System.out.println("회원정보 조회");
						} else if (url.equals("/update")) {
							System.out.println("회원정보 수정");
						} else if (url.equals("/delete")) {
							System.out.println("회원정보 삭제");
						} else if (url.equals("/exit")) {
							System.out.println("종료");
							break;
						} else
							System.out.println("입력오류");
						continue;
					}
				}
			} else {
				System.out.println("입력 오류");
			}
		}
	}
}
