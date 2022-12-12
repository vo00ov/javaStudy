package org.project.controller;

import java.util.Scanner;

import org.project.commend.BoardListDo;
import org.project.commend.ExCuteCommend;
import org.project.commend.LoginOkDo;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.WriteDo;

public class Controller {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ExCuteCommend mc = null;
		
		while(true) {
			
			System.out.print("query : ");
			String query = sc.next();
			
			if(query.equals("insert")) {
				mc = new MemberInsertDo();
				mc.excuteQueryCommned();
			}else if(query.equals("select")) {
				mc = new MemberSelectDo();
				mc.excuteQueryCommned();
			}else if(query.equals("update")) {
				mc = new MemberUpdateDo();
				mc.excuteQueryCommned();
			}else if(query.equals("delete")) {
				mc = new MemberDeleteDo();
				mc.excuteQueryCommned();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else if(query.equals("login")) {
				mc = new LoginOkDo();
				mc.excuteQueryCommned();
			}else if(query.equals("write")) {
				mc = new WriteDo();
				mc.excuteQueryCommned();
			}else if(query.equals("boardList")) {
				mc = new BoardListDo();
				mc.excuteQueryCommned();
			}else {
				System.out.println("입력값 오류");
			}
		}
	}
}