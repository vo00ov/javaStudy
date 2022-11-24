package org.study.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		System.out.println("==========ArrayList============");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
//		list1.add(new Integer(10));
//		list1.add(new Integer(20));
//		list1.add(new Integer(30));
//		list1.add(new Integer(40));
//		list1.add(new Integer(50));
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		// foreach
		for(int i : list1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Iterator
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println(list1.size());
		System.out.println(list1.add(1000));
		list1.add(2, 1000);
		System.out.println(list1.size());
//		list1.clear();
		System.out.println(list1.get(0));
	}
}
