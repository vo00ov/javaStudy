package org.study.commend;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommned() {
		System.out.println("회원수정");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Id : ");
		String userId = sc.next();
		
		System.out.print("Pw : ");
		String userPw = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("Email : ");
		String email =  sc.next();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.updateDo(userId, userPw, age, email);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
		
		
	}

}
