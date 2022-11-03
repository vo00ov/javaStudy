package org.study.arrayEx;

public class ArrayEx03 {

	public static void main(String[] args) {
		System.out.println("배열");
		System.out.println("======로또 번호 추출기======");

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {			
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);
		}
		
//		System.out.println(Math.random());
//		System.out.println(Math.random()*10);
		
		int temp;
		
		for(int i=0; i<1000; i++) {
//			System.out.println((int)(Math.random()*46));
			//random 인덱스 -> (0~44번지)
			int index = (int)(Math.random()*45);
			
			temp=lotto[index];	//random -> temp
			lotto[index] = lotto[0];	//	0번지 -> random
			lotto[0] = temp;
			
		}
		
		for(int i=0; i<6; i++) {
			if(i==5) {
				System.out.print(lotto[i]);
				break;
			}
			System.out.print(lotto[i] + ",");
		}
		
	}
}
