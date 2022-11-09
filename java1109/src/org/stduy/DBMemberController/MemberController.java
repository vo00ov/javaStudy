package org.stduy.DBMemberController;

import java.util.Scanner;

import org.stduy.DBMemberCommend.MemberJoinCommend;
import org.stduy.DBMemberDto.MemberDTO;

public class MemberController {

	public static void main(String[] args) {

		MemberJoinCommend commend1 = new MemberJoinCommend();
		MemberJoinCommend commend2 = new MemberJoinCommend("===제목===");

		// 회원가입 MemberDTO
		// userId 중복 안되게

		MemberDTO member1 = new MemberDTO("m1", "11", 23, "mmm", "서울");
		MemberDTO member2 = new MemberDTO("m2", "22", 33, "mmm", "서울");
		MemberDTO member3 = new MemberDTO("m3", "33", 24, "mmm", "서울");
		MemberDTO member4 = new MemberDTO("m4", "44", 23, "mmm", "서울");
		MemberDTO member5 = new MemberDTO("m5", "55", 23, "mmm", "서울");
		
//		String userId=member1.getUserId();
//		String userPw=member1.getUserPw();
//
//		System.out.println(userId);
//		System.out.println(userPw);
//		
//		if(userId.equals("m1") && userPw.equals("11")) {
//			System.out.println("로그인성공");
//		}else {
//			System.out.println("로그인실패");
//		}
		
		member1.info();
		member2.info();
		member3.info();
		member4.info();
		member5.info();
		
//		MemberDTO[] member = new MemberDTO[5];
//
//		member[0] = member1;
//		member[1] = member2;
//		member[2] = member3;
//		member[3] = member4;
//		member[4] = member5;
//
//		for (int i = 0; i < member.length; i++) {
//
//			member[i].info();
//
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===회원가입===");
		
		System.out.print("ID : ");
		String userId = sc.next();

		System.out.print("PW : ");
		String userPw = sc.next();

		System.out.print("AGE : ");
		int userAge = sc.nextInt();

		System.out.print("NAME : ");
		String userName = sc.next();

		System.out.print("Addr : ");
		String userAddr = sc.next();
		
		MemberDTO member6 = new MemberDTO(userId, userPw, userAge, userName, userAddr);
		
		member6.info();

	}
}
