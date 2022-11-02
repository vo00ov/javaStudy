package org.study.operatorEx;

public class Operator4 {

	public static void main(String[] args) {
		
		System.out.println("비교연산자");

//		String str1 = new String();
//		str1 = "java"
	
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = "java";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("=================");
		System.out.println(55==55);
		System.out.println("java"=="java");
		System.out.println("=================");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println("java"==str3);
		System.out.println("=================");
							// 객체(문자열) 값만 비교
		System.out.println("java".equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
	}
}
