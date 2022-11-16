package org.study.basicPackge;

interface A0{
	abstract public void m1();
}
interface A1{
	
//	public static final int MAXNUM=100;
	int MAXNUM = 100;
//	abstract void ab1();
	void ab1();
	
	default void d1() {
		System.out.println("default");
	}
//	void int1() {
//		System.out.println("인스턴스 메서드");
//	}
}
interface B2 extends A1,A0{
	abstract public void m2();
}

class MainClass implements B2{

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceEx {
	
	public static void main(String[] args) {
		
		new A0() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		MainClass m1 = new MainClass();
		m1.ab1();
		m1.d1();
		m1.m1();
		m1.m2();
		
		A0 a0 = new MainClass();
		a0.m1();

		A1 a1 = new MainClass();
		a1.ab1();
		a1.d1();
	}

}
