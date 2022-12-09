package org.project.commend;

import java.util.Scanner;

import org.project.dao.BoardDao;


public class BoardWrite implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 작성");
				
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("글번호 : ");
//		int bId = sc.nextInt();
		System.out.print("작정자 ID : ");
		String writeId = sc.next();
		sc.nextLine();
		System.out.print("글 내용 : ");
		String bContent = sc.nextLine();
		
		BoardDao dao = new BoardDao();
		
		int result = dao.insertDo(writeId, bContent);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}
	

}
