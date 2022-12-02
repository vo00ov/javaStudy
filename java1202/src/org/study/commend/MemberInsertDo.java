package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberInsertDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원 가입");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ID : ");
		String userId = sc.next();
		System.out.print("PW : ");
		String userPw = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		System.out.print("EMAIL : ");
		String email = sc.next();

		MemberDao dao = new MemberDao();
		
		int result = dao.insertDo(userId, userPw, age, email);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
		
		}

}
