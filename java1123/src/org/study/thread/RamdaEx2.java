package org.study.thread;

// 클래스의 멤버 -> 필드, 메서드, 생성자
class A{
	// 필드
	public int num; 
	public int num2; 
	public int num3; 
	
	public A() {
		System.out.println("기본생성자");
	}
	// 메서드 -> 일하는~
	// 선언부
	public void m1() {
		
		//구현부
		System.out.println("m1");
	}
}
// 상속
class B extends A{
	
	@Override
	public void m1() {
		System.out.println("오버라이딩 m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}

// 추상클래스 -> 추상메서드(미완성에서 -> 선언부만 있고 구현부가 없는 메서드
abstract class Ab1{
	public int num1; // 인스턴스 멤버
	// 추상메서드
	public abstract void abstractM1();
	
	public void m1() {
		System.out.println("m1");
	}
}

class Ab1Sub extends Ab1{

	@Override
	public void abstractM1() {
		System.out.println("추상메서드 오버라이딩");
	}
	@Override
	public void m1() {
		System.out.println("일반메서드 오버라이딩(선택)");
	}

	
}

// 인터페이스 -> 멤버(추상메서드, final상수, default, static), 일반멤버는 사용할수가 없다
interface In1{
	
	public static final int MAXNUM = 1000;
	public abstract void ab1();
	default void defaultM() {
		System.out.println("default메서드");
	}
}

class In1Sub implements In1{
	
	@Override
	public void ab1() {
		System.out.println("추상메서드 ab1 오버라이딩 -> 필수");
	}
	@Override
	public void defaultM() {
		System.out.println("default메서드 defaultM 오버라이딩 -> 선택");
	}
}



public class RamdaEx2 {

	public static void main(String[] args) {
		//익명 클래스 -> 이름이 없는 클래스
		
		new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩 m1_1");
			}
		}.m1();
		
		A a2 = new A() {
			@Override
			public void m1() {
				System.out.println("오버라이딩 m1_2");
			}
		};
		a2.m1();
		
		
//		A a3 = ()->{};	//람다식 interface에서 구현
		
		System.out.println("==============================");
		
		//추상 클래스
		new Ab1() {
			
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩1");
			}
		}.abstractM1();
		
		Ab1 ab1 = new Ab1() {
			
			@Override
			public void abstractM1() {
				System.out.println("추상클래스 오버라이딩2");
			}
		};
		ab1.abstractM1();
		
		System.out.println("==============================");
		
		//인터페이스
		
		new In1() {
			
			@Override
			public void ab1() {
				System.out.println("인터페이스 오버라이딩1");
			}
		}.ab1();
		
		In1 in1 = new In1() {
			
			@Override
			public void ab1() {
				System.out.println("인터페이스 오버라이딩2");
			}
		};
		in1.ab1();
		
		System.out.println("==============================");
		
		In1 in3 = ()->{
			System.out.println("람다식");
		};
		in3.ab1();
		
		
	
		
		
		
		
		
		
		
	}
}
