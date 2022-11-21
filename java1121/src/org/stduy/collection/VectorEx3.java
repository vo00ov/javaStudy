package org.stduy.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {		
				
		Vector<String> v0 = new Vector<String>();
		
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		Iterator<String> iter = v0.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
		
		System.out.println();
				
		Vector<MemberDto> vDto = new Vector<MemberDto>();
		
		vDto.add(new MemberDto("m1", "22231", "asd", 23));
		vDto.add(new MemberDto("m2", "22345231", "qwe", 123));
		vDto.add(new MemberDto("m3", "212331", "zxc", 24));
		
		System.out.println();
		
		for(int i=0; i<vDto.size(); i++) {
//			System.out.println(vDto.get(i));
			System.out.println(vDto.get(i).getUserId());
			System.out.println(vDto.get(i).getUserPw());
			System.out.println(vDto.get(i).getUserName());
			System.out.println(vDto.get(i).getUserAge());
		}
		
		System.out.println();
		
		for(MemberDto i : vDto) {
//			System.out.println(i);
			System.out.println(i.getUserId());
			System.out.println(i.getUserPw());
			System.out.println(i.getUserName());
			System.out.println(i.getUserAge());
		}

		System.out.println();
		
		Iterator<MemberDto> iter1 = vDto.iterator();
		
		while(iter1.hasNext()) {
			MemberDto mem = iter1.next();
//			System.out.println(mem);
			System.out.println(mem.getUserId());
			System.out.println(mem.getUserPw());
			System.out.println(mem.getUserName());
			System.out.println(mem.getUserAge());
		}

		
	}
}
