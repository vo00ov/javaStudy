package org.study.abstractEx;

//추상클래스
public abstract class Abstract1 {

	int num1;
	//추상메서드 -> 미완성 메서드, 선언부만있고 구현부가 X
	//구현 객체에 상속을 통해서 강제로(반드시) 메서드를 오버라이딩 하여 구현
	public abstract void abstractM1();
	public abstract void abstractM2(String name);
	
	public void m1() {
		System.out.println("m1 메서드 (일반)");
	}
	
}
