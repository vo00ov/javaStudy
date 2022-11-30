package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements MemberCommend {

	@Override
	public void excuteQueryCommned() {
		System.out.println("회원 가입");
		// DB Access Object(DAO)
		
		MemberDao dao = new MemberDao();
		
		// userId, userPw, age DB테이블에 추가
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID :");
		String userId = sc.next();
		
		System.out.print("PW :");
		String userPw = sc.next();
		
		System.out.print("AGE :");
		int age = sc.nextInt();
		
		int result = dao.insert(userId, userPw, age);
		
	}

}
