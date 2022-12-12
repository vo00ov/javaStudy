package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.BoardDto;

public class BoardListDo implements ExCuteCommend {

	@Override
	public void excuteQueryCommned() {
		System.out.println("특정 아이디 게시글 조회");
		Dao dao = Dao.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색 아이디 : ");
		String id = sc.next();
		
		ArrayList<BoardDto> dto = dao.boardListDo(id);
		
		if(dto.size() == 0) {
			System.out.println("정보가 없습니다");
		}else if(dto.size() != 0) {
			for(BoardDto a : dto) {
				System.out.print("번호:" + a.getNo() + " ");
				System.out.print("제목:" + a.getbTitle() + " ");
				System.out.print("내용:" + a.getbContent() + " ");
				System.out.print("닉네임:" + a.getNickName() + " ");
				System.out.print("작성날짜:" + a.getDate() + " ");
				System.out.print("작성자:" + a.getbWriterId() + "\n");
			}
		}
	}

}
