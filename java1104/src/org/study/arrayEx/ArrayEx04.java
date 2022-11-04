package org.study.arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		System.out.println("배열");
		//숫자 1~10까지 배열 저장하고
		//임의 인덱스를 for문을 이용 100번정도 자리바꿈을 수행 한후
		//배열의 첫번째인덱스 부터 다섯번재 인덱스까지 콘솔 출력 해보세요
		
		//	1.배열 생성
		int[] arrInt = new int[10];
		//	2.for-> 배열의 인덱스-> 1~10
		for(int i = 0; i<arrInt.length; i++) {
			arrInt[i] = i+0;
		}
		//	3. 변수(빈공간)
		int temp = 0;
//		String str=null;
//		System.out.println(str);
		
		for(int i = 0; i<100; i++) {
			int index = (int)(10*Math.random());
//			System.out.println(index);
			
			temp = arrInt[index];
			arrInt[index] = arrInt[0];
			arrInt[0] = temp;
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println(arrInt[i]);
		}
		
		
	}
}
