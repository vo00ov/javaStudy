package org.study.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		Vector<Integer> v0 = new Vector<Integer>();

		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(new Integer(30));
		v0.add(new Integer(40));
		v0.add(new Integer(50));

		for (int i : v0) {
			System.out.println(i);
		}

		System.out.println("=================================");

		Vector<MemberDto> users = new Vector<MemberDto>();

//		MemberDto dto1 = new MemberDto("asd", "1234", "가나다", 23);
//		MemberDto dto2 = new MemberDto("qwe", "1534", "일이삼", 21);
//		MemberDto dto3 = new MemberDto("zxc", "2454", "에이비씨", 52);
//		MemberDto dto4 = new MemberDto("dsa", "5224", "원투쓰리", 34);
//		MemberDto dto5 = new MemberDto("ewq", "7754", "하나둘셋", 11);
		
		users.add(new MemberDto("asd", "1234", "가나다", 23));
		users.add(new MemberDto("qwe", "1534", "일이삼", 21));
		users.add(new MemberDto("zxc", "2454", "배배배", 52));
		users.add(new MemberDto("dsa", "5224", "제제제", 34));
		users.add(new MemberDto("ewq", "7754", "데데데", 11));


//		System.out.print("ID:"+users.get(0).getUserId());
//		System.out.print(" PW:"+users.get(0).getUserPw());
//		System.out.print(" NAME:"+users.get(0).getUserName());
//		System.out.print(" AGE:"+users.get(0).getAge()+"\n");
		
		for(MemberDto mem : users) {			
			System.out.print("ID:" + mem.getUserId() + " ");
			System.out.print("PW:" + mem.getUserPw() + " ");
			System.out.print("NAME:" + mem.getUserName() + " ");
			System.out.print("AGE:" + mem.getAge() + "\n");
		}
		
		System.out.println("====================================");
		
		Iterator<MemberDto> iter1 = users.iterator();

		while(iter1.hasNext()) {
			MemberDto mem1 = iter1.next();
			System.out.print("ID:" + mem1.getUserId() + " ");
			System.out.print("PW:" + mem1.getUserPw() + " ");
			System.out.print("NAME:" + mem1.getUserName() + " ");
			System.out.print("AGE:" + mem1.getAge() + "\n");
		}

	}
}
