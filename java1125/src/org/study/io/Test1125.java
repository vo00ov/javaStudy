package org.study.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1125 {
	
	public static void main(String[] args) {
		// 순서가 있다. -> 구현객체 ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer el : list) {
			System.out.println(el);
		}
		
		// Set -> 주머니 -> 중복불가능
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.println(i);
		}
		
		// Map -> 키:값 <key, value> - key중복X , value중복 O
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "java");
		map1.put(2, "oracle");
		map1.put(3, "HTML");
		map1.put(4, "javascript");
		map1.put(5, "WEB");
		System.out.println(map1);
		
		Set<Integer> keys = map1.keySet();
		Iterator<Integer> iter2 =keys.iterator();
		while(iter2.hasNext()) {
			Integer i2 = iter2.next();
			
			System.out.println(i2); // key
			System.out.println(map1.get(i2)); // key에 해당하는 value
		}
		
		
	}
}
