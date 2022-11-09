package org.study.oop;

public class Test1109 {

	public static void main(String[] args) {

		int[][] arr1 = new int[3][4];

		int num = 0;

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {

				arr1[i][j] = ++num;

				if (arr1[i][j] == 12) {
					System.out.println(arr1[i][j]);
				} else {
					System.out.print(arr1[i][j] + ",");
				}

			}
		}
	}
}
