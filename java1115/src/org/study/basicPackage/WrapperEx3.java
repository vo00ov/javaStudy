package org.study.basicPackage;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx3 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		//박싱
		int i = 10;
		Integer i2 = new Integer(i);
		System.out.println(Integer.bitCount(i)); // 2진수에서 1의 갯수
		
		System.out.println(i2.intValue()); //언박싱 int
		System.out.println(i2.longValue()); //언박싱 long
		System.out.println(i2.shortValue());//언박싱 short
		
		int i3 = Integer.parseInt("111"); // 문자열을 >> 숫자형으로
		Integer i4 = Integer.parseInt("111"); //문자열을 >> 숫자형으로
		System.out.println(i3 == i4);
		System.out.println(i3 + " , " + i4);
		
											//2진수 111 -> 10진수변환(정수)
		System.out.println(Integer.parseInt("111", 2));
		System.out.println(Integer.toBinaryString(10));	// 정수 >> 2진수
		System.out.println(Integer.toHexString(10)); // 정수 >> 16진수
		System.out.println(Integer.toOctalString(10)); // 정수 >> 8진수
		System.out.println(Integer.toString(10)); // 정수 >> 문자열
		
		String i6 = Integer.toString(100);
		int i7 = Integer.parseInt(i6);
		
		System.out.println(i6);
		System.out.println(i7);

	}
}
