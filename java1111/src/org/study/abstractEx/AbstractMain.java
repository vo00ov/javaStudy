package org.study.abstractEx;

public class AbstractMain {

	public static void main(String[] args) {
		
//		new AbstractEx01();
//		new AbstractEx1Sub2();
		
		AbstractEx1Sub1 a1 = new AbstractEx1Sub1();
		a1.abstractMethod();
		
		AbstractEx1Sub2Sub a2 = new AbstractEx1Sub2Sub();
		a2.abstractMethod();
		a2.abstractMethod2();
	}
}
