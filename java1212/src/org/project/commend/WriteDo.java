package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class WriteDo implements ExCuteCommend {

	@Override
	public void excuteQueryCommned() {
		System.out.println("게시글 작성");
		
		Scanner sc = new Scanner(System.in);
		
		Dao dao = Dao.getInstance();
		
		System.out.print("제목 : ");
		String bTitle = sc.nextLine();
		System.out.print("내용 : ");
		String bContent = sc.nextLine();
		System.out.print("닉네임 : ");
		String nickName = sc.next();
		System.out.print("작성자 : "); 
		String bWriteId  = sc.next();
		
		int result = dao.writeDo(bTitle, bContent, nickName, bWriteId);
		
		if(result != 0) {
			System.out.println("작성 완료");
		}else {
			System.out.println("작성 실패");
		}
	}

}
