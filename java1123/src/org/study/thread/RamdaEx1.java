package org.study.thread;

interface Inter1{
	void interm1();
}

interface Inter2{
	void interm2();
}

public class RamdaEx1 {

	public static void main(String[] args) {
		//interface Inter2 익명클래스 이용해서 추상메서드
		Inter2 in3 = new Inter2() {
			
			@Override
			public void interm2() {
				System.out.println("Inter2");
			}
		};
		in3.interm2();
		
		Inter2 in4 = ()->{
			
			//{}; -> 오버라이딩 생략 
			System.out.println("람다식");
		};
		in4.interm2();
		
		System.out.println("==========================================");
	
		
		
		// 익명클래스로 inter1 구현 		
		Inter1 in1 = new Inter1() {
			
			@Override
			public void interm1() {
				System.out.println("추상메서드1");
			}
		};
		in1.interm1();
		
		Inter1 in2 = ()->{
			System.out.println("추상메서드2");
		};
		in2.interm1();
		
		
		
		
		
		
		
		
		
	}
}
