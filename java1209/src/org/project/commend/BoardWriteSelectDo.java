package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.BoardWriteDao;
import org.project.dto.Board01Dto;

public class BoardWriteSelectDo implements BoardWriteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 조회");
		String choice = "";
		String find = "";
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("(전체, all(작성자+제목), userId, bTitle) : ");
			choice = sc.next();
			
			if(choice.equals("전체")) {
				break;
			}else if(choice.equals("all") || choice.equals("userId") || choice.equals("bTitle")) {
				System.out.print("검색 : ");
				find = sc.next();
				break;
			}else {
				System.out.println("다시 입력");
			}
			
		}
		
		BoardWriteDao dao = new BoardWriteDao();
		ArrayList<Board01Dto> lists = dao.selectDo(choice,find); 
		
		if(lists.size() == 0) {
			System.out.println("조회결과 없음");
		}else if(lists.size() != 0) {
			System.out.println("조회결과");
		}
		
		for(Board01Dto a : lists) {
			System.out.print("No : " + a.getbId() + " ");
			System.out.print("제목 : " + a.getbTitle() + " ");
			System.out.print("내용 : " + a.getbContent() + " ");
			System.out.print("작성자 : " + a.getUserId() + "\n");
		}
	}

}
