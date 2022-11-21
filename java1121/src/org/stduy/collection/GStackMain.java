package org.stduy.collection;

public class GStackMain {

	public static void main(String[] args) {
		
		GStack<Integer> gs1 = new GStack<Integer>();
		
//		int size = gs1.oStack.length;
		
		// push메서드 10번실행
		for(int i=0; i<10; i++) {
			
			//10~100
			int i2 = i*10+10;
			gs1.push(i2);
			System.out.println(gs1.oStack[i]);
		}
		
		System.out.println("=========================");
		// pop메서드 이용해서 모든 oStack의 배열요소를 콘솔에 출력
		for(int i=0; i<gs1.oStack.length; i++) {
			System.out.println(gs1.pop());
		}
		
	}
}
