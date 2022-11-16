package org.study.basicPackge;

public class MathEx2 {

	public static void main(String[] args) {
		
		System.out.println("Math");
		
		// 1. 배열 생성
		int lotto[] = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1; // 1~45
//			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		
		int temp = 0;
		for(int i=0; i<1000; i++) {
			int idx = (int)(Math.random() * 45);
			temp = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = temp;
		}
		
		String num = "";
		for(int i=0; i<6; i++) {
			num += lotto[i] + " ";
		}
		System.out.println(num);
	}
}
