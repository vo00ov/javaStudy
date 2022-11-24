package org.study.thread;

// Thread를 만드는 첫번째 방법(상속)
class ThreadSub extends Thread{
	@Override
	public void run() {
		System.out.println("Thread run()메서드");
	}
}
public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("Thread 생성 -> Thread클래스");
		
		ThreadSub t1 = new ThreadSub();
		t1.start();		// 스레드 시작
	}
}
