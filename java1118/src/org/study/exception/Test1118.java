package org.study.exception;

public class Test1118 {

	public static void main(String[] args) {
		
		int i = 10;	// 기본형
		
		// 박싱
		Integer i2 = new Integer(i); // 객체형
		
		// 언박싱
		i2.intValue(); // 기본형
		int i3 = i2.intValue();
		
		int j = 10;
		// 자동 박싱
		Integer j1 = j; // 기본 -> 객체
		// 자동 언박싱
		int j2 = j1;	// 객체형 -> 기본
		
		Integer a0 = new Integer(10);
		int a1 = a0;
		int a2 = new Integer(10); // 자동언박싱
	}
}
