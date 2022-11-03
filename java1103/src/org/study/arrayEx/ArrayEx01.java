package org.study.arrayEx;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		System.out.println("배열");

		// int배열 arr1을 선언
		int[] arr1 = new int[5];
		// int형 data 5개를 저장 할 수 있는 배열 선언

		System.out.println("arr1");

//		arr1[0] = 10;	// arr1 0번지를 10으로 초기화
//		arr1[1] = 20;	// arr1 0번지를 20으로 초기화
//		arr1[2] = 30;	// arr1 0번지를 30으로 초기화
//		arr1[3] = 40;	// arr1 0번지를 40으로 초기화
//		arr1[4] = 50;	// arr1 0번지를 50으로 초기화

//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);

//		int arr1Size = arr1.length; // 배열의 길이

//		System.out.println(arr1Size);

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 10 + 10;

			System.out.println(arr1[i]);
		}

		System.out.println("==========");

		for (int i : arr1) {
			System.out.println(i);
		}

	}
}
