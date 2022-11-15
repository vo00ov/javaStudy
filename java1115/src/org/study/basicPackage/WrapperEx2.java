package org.study.basicPackage;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx2 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		System.out.println();
		
		Byte b2 = new Byte((byte) 10); // 기본타입 >> Wrapper "박싱"
		Short s2 = new Short((short) 10);
		Integer i2 = new Integer(10);
		Long l2 = new Long(10);
		Float f2 = new Float(1.1f);
		Double d2 = new Double(1.1);
		Character ch2 = new Character('a');
		Boolean bool2 = new Boolean(false);
		
		System.out.println("Wrapper >> 기본타입 (언박싱)");
		
		byte b3 = b2.byteValue();	// Wrapper >> 기본타입 "언박싱"
		short s3 = s2.shortValue();
		int i3 = i2.intValue();
		long l3 = l2.longValue();
		float f3 = f2.floatValue();
		double d3 = d2.byteValue();
		char ch3 = ch2.charValue();
		boolean bool3 = bool2.booleanValue();
		
		System.out.println(b3);
		System.out.println(s3);
		System.out.println(i3);
		System.out.println(l3);
		System.out.println(f3);
		System.out.println(d3);
		System.out.println(ch3);
		System.out.println(bool3);
		
		

	}
}
