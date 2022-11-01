package org.study.operatorEx;

public class Operator12 {
	
	public static void main(String[] args) {
		
		System.out.println("단항 연산자");
		System.out.println("========증가========");
		
		int i = 10;
		// i++, 선 처리 후 증가
		System.out.println(i++);	//	10
		System.out.println(i);		//	11
		i++;						//	12
		System.out.println(i);		//	12
		System.out.println();
		
		// i++, 선 처리 후 증가
		System.out.println(i++);	//	12
		System.out.println(i);		//	13
		i++;						//	13
		System.out.println(i);		//	14
		System.out.println();
		
		System.out.println("=========감소========");
		
		int i1 = 10;
		// i1--, 선 처리 후 감소
		System.out.println(i1--);	//	10
		System.out.println(i1);		//	9
		i1--;						//	9
		System.out.println(i1);		//	8
		System.out.println();
		
		// --i, 선 처리 후 감소
		System.out.println(i1--);	//	8
		System.out.println(i1);		//	7
		i1--;						//	7
		System.out.println(i1);		//	6
		System.out.println();
	
	}
}
