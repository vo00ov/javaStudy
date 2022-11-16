package org.study.basicPackge;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		// 수정이 가능
		StringBuffer sb1 = new StringBuffer("JAVA");
		
		// 기본 문자열 바로 뒤에 문자열을 추가한다.
		sb1.append(" PROJECT2022");
		System.out.println(sb1);
		
		// 문자열 삭제
		sb1.delete(0, 4);
		System.out.println(sb1);
		
		// 지정하는 곳에 문자를 추가할 수 있다.
		sb1.insert(0, "2023");
		System.out.println(sb1);
		
		// 역순
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		System.out.println(sb1);
		// 시작과 끝을 정하고 문자열 수정
		sb1.replace(0, 4, "Oracle");
		System.out.println(sb1);
		
		// 시작지점 정하고 문자열 출력, 원본 손상X
		System.out.println(sb1.substring(4));
		System.out.println(sb1.substring(4, sb1.length() - 4));
		System.out.println(sb1);
	}
}
