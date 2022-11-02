package org.study.loopEx;

public class WhileEx02 {

	public static void main(String[] args) {
		System.out.println("while");
		
		int i = 0;

		//0~9까지만 출력 -> if, break
		while(true) {
			
			System.out.println(i);
			
			if(i>=9) {
				break;
			}
			
			i++;
			
		}
		
	}
}
