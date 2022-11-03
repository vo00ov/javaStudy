package org.study.loopEx;

public class DoWhileEx01 {

	public static void main(String[] args) {
		System.out.println("do~whie");
		//	0~9
		
		//	1.초기화
		int i = 0;
		
		do {
			System.out.println(i);
			i++;	//증감식
			
		}while(i<10);	//2.조건식
	}
}
