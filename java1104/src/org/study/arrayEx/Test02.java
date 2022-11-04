package org.study.arrayEx;

public class Test02 {

	public static void main(String[] args) {
		
		int [] lotto = new int [45];
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i]=i+1;
			
		}
		
		int temp;
		
		for(int i=0; i<1000; i++) {
			
			
			int index = (int)(Math.random()*45);
			
			temp = lotto[index];
			lotto[index] = lotto[0];
			lotto[0] = temp;
			
		}
		
		for(int i = 0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		
	}
}
