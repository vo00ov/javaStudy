package org.study.thread;

import java.awt.Toolkit;

class ThreadSub2 extends Thread{
	int num = 0;
	
	@Override	
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			System.out.println("ThreadSub2 : num-> " + num++);
			toolkit.beep();
			
			try {
				Thread.sleep(500); // 1초 지연 -> 잠시 멈춘 후 1초 후에 다시 실행
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) {
		
		ThreadSub2 t1 = new ThreadSub2();
		t1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("mainThread : " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main Thread 종료");
	}
}
