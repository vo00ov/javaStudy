package org.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();		// 1.4까지
		list.add("java");
		String str = (String) list.get(0);					// 형변화
		
		// 1.5 버전부터
		List<String> list2 = new ArrayList<String>(10);
		List<String> list3 = new ArrayList<>();
		
		list3.add("java");
		String str2 = list3.get(0);
	}
}
