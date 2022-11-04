package org.study.arrayEx;

public class ArrayEx09 {

	public static void main(String[] args) {
		System.out.println("다차원배열");
		
		int arr1[][] = new int[5][5];
		
		int num2 = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				
				arr1[i][j] = num2+1;
				
				if(arr1[i][j] < 10) {
				System.out.print("0"+arr1[i][j]+ " ");	
				}else
				System.out.print(arr1[i][j]+ " ");
				num2++;
			}
			System.out.println();
		}
	}

}
