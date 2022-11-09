package org.study.ex;

public class Ex7 {

	public static void main(String[] args) {
		
		int [][] arr1 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
				
		};
		
		int sum = 0;
		double avg = 0.0;
		int imsi = 0;
		
		for(int i = 0; i<arr1.length; i++) {

			for(int j = 0; j<arr1[i].length; j++) {
				
				sum += arr1[i][j];
				
				
				
			}
			imsi += arr1[i].length;
			avg = sum/imsi;
		}
		
		
		
		System.out.println(sum);
		System.out.println(avg);
				
	}
}
