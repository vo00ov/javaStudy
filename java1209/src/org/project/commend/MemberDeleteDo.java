package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원삭제");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 ID : ");
		String userId = sc.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.deleteDo(userId);
		
		if(result == 1 ) {
			System.out.println("성공");
		}else {
			System.out.println("취소되었습니다");
		}
	}

}
