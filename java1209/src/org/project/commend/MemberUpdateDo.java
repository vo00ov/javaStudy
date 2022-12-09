package org.project.commend;

import java.util.Scanner;

import org.project.dao.MemberDao;

public class MemberUpdateDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원수정");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Id : ");
		String userId = sc.next();
		
		System.out.print("Pw : ");
		String userPw = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.updateDo(userId, userPw, age, email);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

}
