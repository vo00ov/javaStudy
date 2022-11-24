package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		//01.
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		//1, user1
		//2, user2
		//3, user3
		//4, user4
		//5, user5
		//02.
		map1.put(1, "user1");
		map1.put(2, "user2");
		map1.put(3, "user3");
		map1.put(4, "user4");
		map1.put(5, "user5");
		
		//03. key저장 -> Set -> KeySet()저장
		
		Set<Integer> keys = map1.keySet();
		
		//04.
		
		Iterator<Integer> map1Run = keys.iterator();
		
		while(map1Run.hasNext()) {
			int key = map1Run.next();
			String val = map1.get(key);	// key에 해당하는 value
			System.out.println("key:" + key + ", val:" + val);
		}
		
	}
}
