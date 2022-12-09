package org.project.commend;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.Member1207Dto;

public class MemberSortDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("정렬");
		// 아이디별로 내림차순

		Scanner sc = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		String type1 = "";
		String type2 = "";

		
		while(true) {
			
			System.out.print("정렬할 타입(userId,userPw,age,email) : ");
			type1 = sc.next();
			
			
			if(type1.equals("userId")||type1.equals("userPw")||type1.equals("age")||type1.equals("eamil")) {
				break;
			}else {
				System.out.println("다시 입력 해주세요");
			}
		}

		while(true) {
			
			System.out.print("(asc/desc) : ");
			type2 = sc.next();
			
			if(type2.equals("asc")||type2.equals("desc")) {
				break;
			}else {
				System.out.println("다시 입력 해주세요");				
			}
		}

		ArrayList<Member1207Dto> lists = dao.sortDo(type1, type2);
		
		if (lists != null) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

		for (Member1207Dto user : lists) {
			System.out.print("ID:" + user.getUserId() + "\t");
			System.out.print("PW:" + user.getUserPw() + "\t");
			System.out.print("AGE:" + user.getAge() + "\t");
			System.out.print("EMAIL:" + user.getEmail() + "\n");
		}
	}

}
