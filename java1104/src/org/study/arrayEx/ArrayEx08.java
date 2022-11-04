package org.study.arrayEx;

public class ArrayEx08 {

	public static void main(String[] args) {
		System.out.println("다차원배열");
		
		int[][] arr1 = new int[3][4];
		
		System.out.println(arr1.length);	// 행 갯수
		System.out.println(arr1[0].length);	// 열 갯수
//		System.out.println(arr1[0][0]);	// 열 갯수
//		System.out.println(arr1[0][1]);	// 열 갯수
//		System.out.println(arr1[0][2]);	// 열 갯수
//		System.out.println(arr1[0][3]);	// 열 갯수
		
	
		int num = 0;
		
		for(int i=0; i<arr1.length; i++) {	//행
//			System.out.println(arr1[i]);
			
						// 행 -> 열갯수
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j]= ++num;
				System.out.print(arr1[i][j] + " ");
			}
			
			System.out.println();
			
		}
	}

}
