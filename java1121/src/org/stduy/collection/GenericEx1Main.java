package org.stduy.collection;

public class GenericEx1Main<T> {

	public static void main(String[] args) {
		// 외부에서 인스턴스화 한 후에 타입을 정함(객체형)
		
		
		// GenericType Integer
		GenericEx1<Integer> g1 = new GenericEx1<Integer>();
//		g1.t1 = new Integer(10);	// 박싱
		g1.t1 = 10;					// 자동박싱
		
//		int num1 = g1.m1(10).intValue();	// 언박싱
		int num1 = g1.m1(10); 				// 자동언박싱
		
		// GenericType String
		GenericEx1<String> g2 = new GenericEx1<String>();
		g2.t1 = "String type";
		String str1 = g2.m1("문자열");
		

	}
	
}
