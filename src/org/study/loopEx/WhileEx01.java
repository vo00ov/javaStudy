package org.study.loopEx;

public class WhileEx01 {

	public static void main(String[] args) {
		System.out.println("while");
		
		int i = 0;	//	1. 초기화
		
			//2.조건식
		while(i<10) {
			//조건식 true
//			System.out.println(i);
			if(i>=9) {				
				System.out.print(i);
			}else {				
				System.out.print(i + ",");
			}
			
			i++;
			
		}
	}
}
