package org.study.exceptionEx;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println("=====Exception=====");
		
		// ArrayIndexOutOfBoundsException
		// 배열의 인덱스 초과시

		int[] arr = new int[5];

		try {
			for (int i = 0; i < 6; i++) {
				arr[i] = i;
			}
			
			System.out.println("문제없음");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("예외처리");
		} finally {
			// Connection close
			System.out.println("기본실행");
		}

		System.out.println("정상 실행");

	}
}
