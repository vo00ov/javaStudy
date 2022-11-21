package org.stduy.collection;

public class GStack<T> {

	public int idx;		// 배열의 index
	public Object[] oStack;
	
	public GStack() {
		idx = 0;
		oStack = new Object[10];	// Object 배열  10개
	}
	
	// push 메서드 -> idx -> 0~9번 1씩 증가 10번지 중지
	// 매개변수 입력받은 인자를 oStack배열에 추가
	public void push(T element) {
		if(idx==10) {
			return;	// 10번지 중지
		}
		
		oStack[idx] = element;	// 매개변수 입력받은 인자를 oStack배열에 추가(10개)
		
		idx++;		// 0~9번지
		
	}
	
	// pop메서드 -> 배열oStack 마지막번지부터 첫번째번지
	// 0번지가 되면 중지
	public T pop() {
		if(idx==0) {
			return null;
		}
		
		idx--; 	// 10 -> 9
		return (T) oStack[idx];
		
	}
	
}
