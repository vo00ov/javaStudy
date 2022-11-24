package org.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.study.dto.MemberDto;

public class MemberController {

	public static void main(String[] args) {
		
		// ArrayList 생성, 요소는 MemberDto
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		// lists요소 5개 생성 MemberDto userId는 중복되면 안된다.
		// for문, foreach문 콜솔 출력
		// 아이디 :~ 비밀번호: ~
		
		lists.add(new MemberDto("ID01", "12345", "a@gmail.com", 22));	
		lists.add(new MemberDto("ID02", "1s212", "b@gmail.com", 25));	
		lists.add(new MemberDto("ID03", "23142", "c@gmail.com", 46));	
		lists.add(new MemberDto("ID04", "14362", "d@gmail.com", 52));	
		lists.add(new MemberDto("ID05", "53412", "e@gmail.com", 32));	
		
		Collections.reverse(lists);
		System.out.println("==============for문===============");
		for(int i=0; i<lists.size(); i++) {
			System.out.print("아이디:" + lists.get(i).getUserId() + " ");
			System.out.print("비밀번호:" + lists.get(i).getUserPw() + " ");
			System.out.print("이메일:" + lists.get(i).getEmail() + " ");	
			System.out.print("나이:" + lists.get(i).getAge() + "\n");
		}
		
		System.out.println("==========foreach=============");
		Collections.reverse(lists);
		for(MemberDto user : lists) {
			System.out.print("아이디:" + user.getUserId() + " ");
			System.out.print("비밀번호:" + user.getUserPw() + " ");
			System.out.print("이메일:" + user.getEmail() + " ");	
			System.out.print("나이:" + user.getAge() + "\n");
		}
		
		System.out.println("==============iterlator===========");
		Iterator<MemberDto> iter = lists.iterator();
		while(iter.hasNext()) {
			MemberDto user = iter.next();
			System.out.print("아이디:" + user.getUserId() + " ");
			System.out.print("비밀번호:" + user.getUserPw() + " ");
			System.out.print("이메일:" + user.getEmail() + " ");	
			System.out.print("나이:" + user.getAge() + "\n");	
		}
		

	}
}
