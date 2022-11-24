package org.study.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		System.out.println("=============LinkedList===============");
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		// 생성방법
		LinkedList<Integer> i1 = new LinkedList<Integer>();		// 타입 지정
		LinkedList<Integer> i2 = new LinkedList<>();			// 타입 생략 가능
		LinkedList<Integer> i3 = new LinkedList<>(a1);			// 다른 Collection값으로 초기화
		
		for(int i : i3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(10);		// 가장 앞에 데이터 추가
		list.addLast(20);		// 가장 뒤에 데이터 추가
		list.add(30);			// 데이터 추가
		list.add(1, 100);		// index 1에 데이터 100 추가
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
//		list.removeFirst();		// 가장 앞의 데이터 제거
//		list.removeLast();		// 가장 뒤의 데이터 제거
//		list.remove();			// 생략시 0번째 index제거
//		list.remove(1);			// index 1제거
//		list.clear();			// 모든 값 제거
		
		System.out.println(list.contains(10));	// list에 10이 있는지 검색 
		System.out.println(list.indexOf(10));	// 10이 있는 index반환 없으면 -1
		System.out.println(list.indexOf(30));	// 30이 있는 index반환 없으면 -1
		
	}
}
