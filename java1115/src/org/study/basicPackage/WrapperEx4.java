package org.study.basicPackage;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx4 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		
		Integer i10 = new Integer(10); // 박싱
		int i11 = i10.intValue(); // 언박싱
		
		Integer i20 = 10; // 자동 박싱
		int i22 = i20; // 자동 언박싱

		System.out.println("문자열 : " + i10.toString());
		
		Character c10 = new Character('a');
		char c11 = c10.charValue();
		
		Boolean b10 = new Boolean(false);
		boolean b11 = b10.booleanValue();
		
		Float f10 = new Float(1.1f);
		float f11 = f10.floatValue();
		
		String sF10 = f10.toString();
		System.out.println("문자열 : " + sF10);
		
		Double d10 = new Double(1.1);
		double d11 = d10.doubleValue();
		
		Short s10 = new Short((short) 10);
		short s11 = s10.shortValue();
	}
}
