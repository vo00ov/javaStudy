package org.stduy.collection;

public class Test1121 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			arr[5] = 10;
			System.out.println("예외 X");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("예외 O");
		}finally {
			System.out.println("기본실행");
		}
		
		System.out.println("정상실행");
	}
}
