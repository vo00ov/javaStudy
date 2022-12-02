package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDeleteDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원 삭제");
		
		Scanner sc = new Scanner(System.in);
		
		MemberDao dao = new MemberDao();
		
		System.out.print("삭제할 ID : ");
		String userId = sc.next();
		
		int result = dao.deleteDo(userId);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

}
