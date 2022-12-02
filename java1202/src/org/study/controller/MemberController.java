package org.study.controller;

import java.util.Scanner;

import org.study.commend.ExcuteQueryCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("=====CRUD======");
		Scanner sc = new Scanner(System.in);
		ExcuteQueryCommend ex = null;
		
		
		while(true) {
			System.out.print("(Query : insert,select,update,delete / 종료 : exit) : ");
			String query = sc.next();
			
			if(query.equals("insert")) {
				ex = new MemberInsertDo();
				ex.excuteCommend();
			}else if(query.equals("select")) {
				ex = new MemberSelectDo();
				ex.excuteCommend();
			}else if(query.equals("update")) {
				ex = new MemberUpdateDo();
				ex.excuteCommend();
			}else if(query.equals("delete")) {
				ex = new MemberDeleteDo();
				ex.excuteCommend();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력 오류");
			}
		}
	}
}
