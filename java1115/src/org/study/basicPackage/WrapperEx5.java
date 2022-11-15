package org.study.basicPackage;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx5 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		
		int i = 10;
		Integer i2 = new Integer(i);	//	박싱(기본자료형 >> Wrapper)
		int i3 = i2.intValue();			// 	언박싱(Wrapper >> 기본자료형)
		
		Integer i4 = 10;	// 자동 박싱
		int i5 = i4;		// 자동 언박싱
		int i6 = new Integer(100);
		System.out.println(i4.toString());
		
		Integer i7 = new Integer("111");	//	String >> Integer
		int i77 = i7.intValue();			//	Integer >> int(언박싱)
		
		String str = "1111";
		int i8 = Integer.parseInt(str);		//	String >> Integer >> int
		
		Character c10 = new Character('a');	//	박싱
		char c11 = c10.charValue();			//	언박싱
	}
}
