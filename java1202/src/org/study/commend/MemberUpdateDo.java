package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원 수정");
		
		MemberDao dao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 ID : ");
		String userId = sc.next();
		System.out.print("PW : ");
		String userPw = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		System.out.print("EMAIL : ");
		String email = sc.next();
		
		int result = dao.updateDo(userId, userPw, age, email);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

}
