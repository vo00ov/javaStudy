package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberDeleteDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 ID : ");
		String userId = sc.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.deleteDo(userId);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

	
}
