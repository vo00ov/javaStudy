package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("가수1", "이모모");
		map1.put("가수1", "강모모");
		map1.put("가수2", "나모모");
		map1.put("가수3", "박모도");
		map1.put("가수4", "김모도");
		map1.put("가수5", "김모도");
		
		System.out.println(map1);
		System.out.println(map1.get("가수1"));
		
		// 1.keySet() -> key를 set (key는 중복되지 않는다)
		Set<String> set = map1.keySet();	// key값을 저장
		// 2.출력Iterator
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			String val = map1.get(key);	// key값 이용해서 value를 get
			System.out.println("키 : " + key + " 값 : " +  val);
		}
	}
}
