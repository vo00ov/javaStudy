package org.study.oop;

import java.util.Date;

public class FiledEx {
	// 클래스의 
	// 인스턴스 멤버
	public int num;			// 기본자료형
	public String name;		// String
	private int[] arr1;		// 배열
	public Date day;		// 라이브러리
	public Car car;			// 클래스
	
	// 클래스 필드
	private static final String MEMBER = "JAVA";
	
	public static void method() {
		System.out.println(MEMBER);
	}
}
