package org.java.variableEx;

public class CastingEx {

	public static void main(String[] args) {
		System.out.println("형변화");
		System.out.println("자동형변환");
		
		int i = 10;
		double d = 1.1;
//		int i2 = i+d;		//	int + double
		double d2 = i + d;	//	int + double	
		double d3 = 20 + 1.5;
		
		byte b1 = 10;
		byte b2 = 20;
		short s1 = 20;

//		byte b3 = b1 + b2;	//	byte + byte -> int
		int i3  = b1 + b2;
//		short s2 = b1 + s1;	//	short + byte -> int
		int i2 = b1 + s1;	//	short + byte -> int
		
		System.out.println("강제형변환");
		
		int j = (int)1.1;
		System.out.println(j);	//	소수점 증발,데이터 손실
		
		int j2 = 10 + (int)1.1;	//	소수점 증발,데이터 손실
		System.out.println(j2);
		
		byte b4 = 10;
		byte b5 = 20;
		byte b6 = (byte)(b4 + b5);
		System.out.println(b6);
	}
}
