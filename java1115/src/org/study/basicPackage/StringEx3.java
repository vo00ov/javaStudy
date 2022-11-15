package org.study.basicPackage;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println("String");
		
//		String str1 = "java 2022 project";
//		
//		System.out.println(str1.length());
//		String str2 = str1.substring(5);
//		System.out.println(str2);
//		System.out.println(str1);
		
		// .do 제외한 문자열을 추출 -> 하나의 메서드 substring()
//		String query1 = "/insert.do";
//		String query2 = "/select.do";
//		String query3 = "/update.do";
//		String query4 = "/delete.do";
		
		// 끝자리 세자리가 .do로 입력을 받아서 .do제외한 문자열의 값이
		// /insert면 -> 회원가입 실행
		// /select면 -> 회원조회 실행
		// /update면 -> 회원수정 실행
		// /delete면 -> 회원삭제 실행
		// /exit -> 종료
		// 나머지 입력되면 -> URI를 다시 입력하세요.
		
//		System.out.println(query1.substring(0, query1.length()-3));
//		System.out.println(query2.substring(0, query2.length()-3));
//		System.out.println(query3.substring(0, query3.length()-3));
//		System.out.println(query4.substring(0, query4.length()-3));
		
//		while(true) {
//			System.out.println("입력 문자열의 끝 3자리 값이 .do 일때 실행");
			
		
		Scanner sc = new Scanner(System.in);
		
		
			
			System.out.print("query문 입력 : ");
			String query = sc.next();
		
			if(query.substring(query.length()-3).equals(".do")) {
				if(query.substring(0, query.length()-3).equals("/insert")){
					System.out.println("회원가입실행");
				}else if(query.substring(0, query.length()-3).equals("/select")) {
					System.out.println("회원정보실행");
				}else if(query.substring(0, query.length()-3).equals("/update")) {
					System.out.println("회원정보수정");
				}else if(query.substring(0, query.length()-3).equals("/delete")) {
					System.out.println("회원정보삭제");
				}else {
					System.out.println("입력오류");
				}
			}else {
				System.out.println("입력 오류!");
			}
//		}
		
		
	}
}
