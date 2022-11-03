package org.study.arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		System.out.println("배열");

		int[] arr1 = new int[5];
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		System.out.println();
		
		int[] arr2 = new int[] {1,2,3,4,5};
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		int[] arr3 = {1,2,3,4,5};
		for(int i :  arr3) {
			System.out.print(i);
		}
		
		System.out.println();
		
		char[] arrch = {'a', 'b', 'c', 'd', 'e'};
		for(int i = 0; i<arrch.length; i++) {
			System.out.print(arrch[i]);
		}
		
		System.out.println();
		
		String[] strArr = {"java", "JSP", "Thyemleaf", "javascript", "HTML"};
		for(String str : strArr) {
			System.out.println(str);
		}
	}
}
