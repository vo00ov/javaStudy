package org.study.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExcuteCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원조회");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("조회 ID : ");
		String userId = sc.next();
		
		MemberDao dao= new MemberDao();
//		ArrayList<MemberDto> lists = dao.selectDo();
		ArrayList<MemberDto> lists = dao.selectDo(userId);
		
		if(lists!=null) {
			System.out.println("성공");
			for(MemberDto list : lists) {
				System.out.print(list.getUserId() + " ");
				System.out.print(list.getUserPw() + " ");
				System.out.print(list.getAge() + "\n");
			}
		}else {
			System.out.println("실패");
		}
	}

	
}
