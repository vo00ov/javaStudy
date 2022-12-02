package org.study.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExcuteQueryCommend {

	@Override
	public void excuteCommend() {
		System.out.println("회원 조회");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색 (공백시 전체조회): ");
		String userId = sc.nextLine().replaceAll("\\s", "");

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> users = dao.selectDo(userId);
		
		if(users.size() != 0 ) {
			for(MemberDto list : users) {
				System.out.print("ID:" + list.getUserId() + " ");
				System.out.print("PW:" +list.getUserPw() + " ");
				System.out.print("AGE:" + list.getAge() + " ");
				System.out.print("EMAIL:" + list.getEmail() + "\n");
			}
		}else if(users.size() == 0) {
			System.out.println("조회할 수 있는 아이디가 없습니다");
		}
	}

}
