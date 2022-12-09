package org.project.controller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.BoardWrite;
import org.project.commend.MemberAgeDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberSortDo;
import org.project.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("메인창");
		Scanner sc = new Scanner(System.in);
		
		MemberCommend mc = null;
		
		while(true) {
			
			System.out.print("query : ");
			String query = sc.next();
			
			if(query.equals("insert")) {
				mc = new MemberInsertDo();
				mc.excuteQueryCommend();
			}else if(query.equals("select")) {
				mc = new MemberSelectDo();
				mc.excuteQueryCommend();
			}else if(query.equals("update")) {
				mc = new MemberUpdateDo();
				mc.excuteQueryCommend();
			}else if(query.equals("delete")) {
				mc = new MemberDeleteDo();
				mc.excuteQueryCommend();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else if(query.equals("age")){
				mc = new MemberAgeDo();
				mc.excuteQueryCommend();
			}else if(query.equals("sort")){
				mc = new MemberSortDo();
				mc.excuteQueryCommend();
			}else if(query.equals("BoardWrite")){
				mc = new BoardWrite();
				mc.excuteQueryCommend();
			}else if(query.equals("board")){
				BoardWriteFK.main(args);
				break;
			}else {
				System.out.println("입력문 오류");
			}
		}
		
	}
}
