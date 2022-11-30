package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		// Controller -> 
		// 1.사용자 요청(Request) 받아서
		// 2.일을 시키고		commend
		// 3.결과 받아서 반환값을 이용해서
		// 4.다시 View로 응답 (Request)
		
		
		Scanner sc = new Scanner(System.in);
		String query = "";
		MemberCommend a = null;
		
		while(true) {
			System.out.print("SQL문을 입력하세요.(insert, select, update, delete)");
			query = sc.next();
			
			if(query.equals("insert")) {
				a = new MemberInsertDo();
				a.excuteQueryCommned();
			}else if(query.equals("select")) {
				a = new MemberSelectDo();
				a.excuteQueryCommned();
			}else if(query.equals("update")) {
				a = new MemberUpdateDo();
				a.excuteQueryCommned();
			}else if(query.equals("delete")) {
				a = new MemberDeleteDo();
				a.excuteQueryCommned();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력오류");
			}
			
		}
	}
}
