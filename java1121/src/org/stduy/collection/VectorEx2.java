package org.stduy.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		
		// 객체형, 컬렉션 반복문
		Vector<String> v0 = new Vector<String>();
		v0.add(new String("user1"));
		v0.add(new String("user2"));
		v0.add(new String("user3"));
		v0.add(new String("user4"));
		v0.add(new String("user5"));
		
		// for문
		System.out.println("======for문======");
		for(int i=0; i<v0.size(); i++) {
			System.out.print(v0.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// foreach문
		System.out.println("====foreach문=====");
		for(String i : v0) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// Iterator문
		System.out.println("====Iterator문====");
		Iterator<String> iter = v0.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + " ");
		}
	}
}
