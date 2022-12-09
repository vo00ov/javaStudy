package org.project.controller;

import java.util.Scanner;

import org.project.commend.BoardWriteCommend;
import org.project.commend.BoardWriteDeleteDo;
import org.project.commend.BoardWriteInsertDo;
import org.project.commend.BoardWriteSelectDo;
import org.project.commend.BoardWriteUpdateDo;

public class BoardWriteFK {

	public static void main(String[] args) {
		System.out.println("게시판");
		Scanner sc = new Scanner(System.in);

		BoardWriteCommend bc = null;

		while (true) {
			System.out.println("선택 : ");

			String choice = sc.next();

			if (choice.equals("write")) {
				bc = new BoardWriteInsertDo();
				bc.excuteQueryCommend();
			} else if(choice.equals("read")) {
				bc = new BoardWriteSelectDo();
				bc.excuteQueryCommend();
			} else if(choice.equals("update")) {
				bc = new BoardWriteUpdateDo();
				bc.excuteQueryCommend();
			} else if(choice.equals("delete")) {
				bc = new BoardWriteDeleteDo();
				bc.excuteQueryCommend();
			}else if(choice.equals("exit")) {
				MemberController.main(args);
				break;
			} else {
				System.out.println("입력 오류");
			}
		}

	}

}
