package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class MemberInsertDo  implements ExCuteCommend{

	@Override
	public void excuteQueryCommned() {
		System.out.println("회원가입");
		Scanner sc = new Scanner(System.in);

		// 싱글톤 패턴 -> 객체를 한번만 생성
		Dao dao = Dao.getInstance();
		
		
		System.out.print("ID : ");
		String userId = sc.next();
		System.out.print("PW : ");
		String userPw = sc.next();
		System.out.print("EMAIL");
		String email = sc.next();
		
		
		int result = dao.insertDo(userId, userPw, email);
		
		if(result != 1) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

}
