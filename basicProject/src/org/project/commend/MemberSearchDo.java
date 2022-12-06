package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSearchDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원 검색");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색어 :");
		String userId = sc.next();
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list = dao.searchDo(userId);
		
		if(list.size()==0) {
			System.out.println("등록된 정보가 없습니다");
		}else if(list.size()!=1) {
			System.out.println("검색 결과");
		}
		
		for(MemberDto user : list) {
			System.out.print("ID:" + user.getUserId() + "\t");
			System.out.print("PW:" + user.getUserPw() + "\t");
			System.out.print("AGE:" + user.getAge() + "\t");
			System.out.print("EMAIL:" + user.getEmail() + "\n");
		}
	}

}
