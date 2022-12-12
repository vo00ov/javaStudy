package org.project.commend;

import java.util.Scanner;

import org.project.dao.Dao;

public class LoginOkDo implements ExCuteCommend {

	@Override
	public void excuteQueryCommned() {
		Scanner sc = new Scanner(System.in);
		Dao dao = Dao.getInstance();
		
		System.out.print("ID : ");
		String userId = sc.next();
		System.out.print("PW : ");
		String userPw = sc.next();
		
		int result = dao.loginOkDo(userId, userPw);
		
		if(result==0) {
			System.out.println("로그인 실패");
		}else if(result==1) {
			System.out.println("로그인 성공");
			
			
		}
		
	}

}
