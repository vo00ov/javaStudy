package org.project.commend;

import java.util.Scanner;

import org.project.dao.BoardWriteDao;

public class BoardWriteInsertDo implements BoardWriteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 작성");

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("제목 : ");
		String bTitle = sc.nextLine();
		System.out.print("내용 : ");
		String bContent = sc.nextLine();
		System.out.print("작성자 : ");
		String userId = sc.next();
		
		BoardWriteDao dao = new BoardWriteDao();
		
		int result = dao.insertDo(bTitle, bContent, userId);
		
		if(result == 1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}

}
