package org.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController3 {

	public static void main(String[] args) {
		
		// Scaaner 이용 아이디, 비밀번호, 이메일, 나이
		
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDto>  lists = new ArrayList<MemberDto>();
		
		lists.add(new MemberDto("m1", "1234", "m1@gmail.com", 18));

		String userId = lists.get(0).getUserId();
		String userPw = lists.get(0).getUserPw();
		
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		if(id.equals(userId) && pw.equals(userPw)) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		
	}
}
