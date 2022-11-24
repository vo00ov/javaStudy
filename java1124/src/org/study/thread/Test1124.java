package org.study.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1124 {
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);	// 자동박싱
		st.push(20);	// 자동박싱
		st.push(30);	// 자동박싱
		st.push(40);	// 자동박싱
		st.push(50);	// 자동박싱
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		for(int i=0; i<5; i++) {
			qu.add(i*10+10);
		}
		
		System.out.println(qu);
		System.out.println(qu.peek());
		
		int i = 2;
		while(i<10) {
			
			int j=1;
			while(j<10) {
				System.out.println(i + "*" + j+ "="+ i*j);
				j++;
			}
			
			++i;
			
		}
	}
}
