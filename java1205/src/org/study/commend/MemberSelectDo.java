package org.study.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommned() {
		System.out.println("회원조회");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조회(공백시 전체조회) : ");
		String userId = sc.nextLine().replaceAll("\\s", "");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list = dao.selectDo(userId);
		
		if(list.size() != 0) {
			for(MemberDto user : list) {
				System.out.print("Id : " + user.getUserId() + " ");
				System.out.print("Pw : " + user.getUserPw() + " ");
				System.out.print("나이 : " + user.getAge() + " ");
				System.out.print("email : " + user.getEmail() + "\n");
			}
		}else if(list.size() == 0) {
			System.out.println("회원정보가 없습니다");
		}
		
		
	}

}
