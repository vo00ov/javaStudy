package org.study.operatorEx;

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("대입연산자");
		
		int i = 10;
		char ch = 'a';
		int j = 10 + 50 * 19;
		
		String str1 = new String();
		str1 = "String-> 문자열";
		
		System.out.println("====================================");
		
		int k = 10;
		System.out.println(k);
		
		k += 10;
		System.out.println(k);
		
		k -= 10;
		System.out.println(k);
		
		k *= 10;
		System.out.println(k);
		
		k /= 10;
		System.out.println(k);
		
		k %= 10;
		System.out.println(k);
	}
}
