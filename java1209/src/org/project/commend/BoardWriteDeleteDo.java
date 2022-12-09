package org.project.commend;

import java.util.Scanner;

import org.project.dao.BoardWriteDao;

public class BoardWriteDeleteDo implements BoardWriteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("게시글 삭제");

		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.print("번호 : ");
			int bId = sc.nextInt();
			sc.nextLine();
			System.out.print("제목 : ");
			String bTitle = sc.nextLine();
			System.out.print("작성자 : ");
			String userId = sc.next();
			
			System.out.print("삭제?(y/n) : ");
			String yn = sc.next();
			
			if(yn.equals("y")) {
				BoardWriteDao dao = new BoardWriteDao();
				
				int result = dao.deleteDo(bTitle, userId, bId);
				
				if(result == 1) {
					System.out.println("성공");
					break;
				}else {
					System.out.println("실패");
					break;
				}		
			}else if(yn.equals("n")) {
				System.out.println("취소");
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

}
