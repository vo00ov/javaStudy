package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원가입");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디:");
		String userId = sc.next();
		System.out.print("비밀번호:");
		String userPw = sc.next();
		System.out.print("나이:");
		int age = sc.nextInt();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.insertDo(userId, userPw, age);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

	
}
