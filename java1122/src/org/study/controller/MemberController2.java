package org.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.study.dto.MemberDto;

public class MemberController2 {

	public static void main(String[] args) {
		
		// Scaaner 이용 아이디, 비밀번호, 이메일, 나이
		
		ArrayList<MemberDto>  lists = new ArrayList<MemberDto>();
		Scanner sc = new Scanner(System.in);
		
		// exit가 입력되면 회원가입 종료
		
		System.out.println("======Sign In======");
		boolean key = false;
		
		while(!key) {	
			System.out.println("회원가입? (종료 = n)");
			String yn = sc.next();
			
			if(!yn.equals("n")) {
				
				
				System.out.print("ID 입력 : ");
				String userId = sc.next();
				
				System.out.print("PW 입력 : ");
				String userPw = sc.next();
				
				System.out.print("EMAIL 입력 : ");
				String email = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				lists.add(new MemberDto(userId, userPw, email, age));
				
				
			}else {
				System.out.println("종료");
				key = true;
			}
		
		}
		
		
//		while(true) {	
//			System.out.println("회원가입? (y/n)");
//			String yn = sc.next();
//			
//			if(yn.equals("n")) {
//				System.out.println("프로그램 종료");
//				break;
//			}else if(yn.equals("y")) {
//				
//				System.out.println("======Sign In======");
//				
//				System.out.print("ID 입력 : ");
//				String userId = sc.next();
//				
//				System.out.print("PW 입력 : ");
//				String userPw = sc.next();
//				
//				System.out.print("EMAIL 입력 : ");
//				String email = sc.next();
//				
//				System.out.print("나이 입력 : ");
//				int age = sc.nextInt();
//				
//				lists.add(new MemberDto(userId, userPw, email, age));
//				
//				
//			}else {
//				System.out.println("잘못된 값입니다.");
//				continue;
//			}
//		}
		
		System.out.println("=======회원 명단========");
		
		int no = 0;
		for(MemberDto user : lists) {
		
			System.out.print(no + ". ");
			System.out.print("ID:" + user.getUserId() + " ");
			System.out.print("PW:" + user.getUserPw() + " ");
			System.out.print("EMAIL:" + user.getEmail()+ " ");
			System.out.print("AGE:" + user.getAge()+ "\n");
			
			no++;
		
//		int no = 0;
//		for(int i = 0; i<lists.size(); i++) {
//			
//			System.out.print(no + ". ");
//			System.out.print("ID:" + lists.get(i).getUserId() + " ");
//			System.out.print("PW:" + lists.get(i).getUserPw() + " ");
//			System.out.print("EMAIL:" + lists.get(i).getEmail()+ " ");
//			System.out.print("AGE:" + lists.get(i).getAge()+ "\n");
			
//			++no;
		}
		
	}
}
