package org.study.collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
//		ArrayList<Integer> lists = new ArrayList<Integer>();
		ArrayList<Integer> lists = new ArrayList<>();
		
		lists.add(new Integer(0));
		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.add(40);
		lists.add(50);
		
		
		for(Integer i : lists) {
			System.out.println(i);
		}
		
	}
}
