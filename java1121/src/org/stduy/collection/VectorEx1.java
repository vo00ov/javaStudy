package org.stduy.collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		// List<E> 인터페이스 슈퍼클래스
		// 순서가 있다.
		// 길이가 자동 조절
		// 객체를 요소로 가지고 있다.
		// 중복값을 허용
		
		Vector<Integer> v0 = new Vector<Integer>();
		
//		Integer i = new Integer(1000);
//		Integer i = 1000;
		
		v0.add(new Integer(1));	// 박싱
		v0.add(12);				// 자동방식
		v0.add(123);
		v0.add(1234);
		v0.add(12345);
		
		System.out.println("Vector 요소 개수 : " + v0.size());
		System.out.println(v0);
		
		// 벡터 v0의 모든 요소를 콘솔에 출력 for문
		
		for(int i=0; i<v0.size(); i++) {
			System.out.print(v0.get(i) + " ");
		}
		
		System.out.println();
		
		// 반복문 -> foreach
		for(Integer el : v0) {
			System.out.print(el + " ");
		}
		
		System.out.println();
		System.out.println(v0.size());
		v0.add(2, 54321);	//	2번지에 54321 추가
		System.out.println(v0.size());
		for(int i : v0) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(111);
		v1.add(222);
		v1.add(333);
		v1.add(444);
		v1.add(555);
		
		
		for(int i : v1) {
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		v0.addAll(v1);
	
		for(int i : v0) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println(v0.size());
		
		System.out.println();
		
		System.out.println(v0.contains(123));
		System.out.println(v0.contains(12345));
		System.out.println(v0.contains(8483));
		
		if(v0.contains(1234)) {
			System.out.println("포함");
		}else {
			System.out.println("미포함");
			
		}
		
		System.out.println();
		
		System.out.println(v0.elementAt(5));
		System.out.println(v0.indexOf(123));
		System.out.println(v0.indexOf(1234124));
		System.out.println(v0.isEmpty());
		System.out.println(v0.size());
		
		v0.remove(0);	// 특정 인덱스 삭제
		System.out.println(v0.size());
		
		for(int i : v0) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		v0.remove(new Integer(123));	// 특정요소 삭제
//		v0.remove(1234);					// 특정요소 삭제 *주의
		
		for(int i : v0) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
//		v0.clear();
//		System.out.println(v0.size());
		System.out.println(v0 + " " +  v0.size());
		v0.removeAll(v1);
		System.out.println(v0 + " " + v0.size());
		
		Object[] arrObj = v0.toArray();
		System.out.println(arrObj);
	}
}
