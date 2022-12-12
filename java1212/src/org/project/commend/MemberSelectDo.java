package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.MemberDto;


public class MemberSelectDo  implements ExCuteCommend{

	@Override
	public void excuteQueryCommned() {
		System.out.println("회원조회");
		
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.print("검색(공백시 전제조회):");
//		String userId = sc.nextLine().replaceAll("\\s", "");
		
		Dao dao = Dao.getInstance();
		ArrayList<MemberDto> list = dao.selectDo();
		
		if(list.size() == 0) {
			System.out.println("등록된 정보가 없습니다");
		}else if(list.size()!=0) {
			System.out.println("조회결과");
		}

		for(MemberDto user : list) {
			System.out.print("ID:" + user.getUserId() + "\t");
			System.out.print("PW:" + user.getUserPw() + "\t");
			System.out.print("EMAIL:" + user.getEmail() + "\n");
		}
		
	}
	

}
