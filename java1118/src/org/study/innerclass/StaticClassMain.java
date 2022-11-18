package org.study.innerclass;

public class StaticClassMain {

	public static void main(String[] args) {
		System.out.println("====static클래스=====");
		
		//	클래스 안에있는 static클래스
		StaticClass.StaticBasic st = new StaticClass.StaticBasic();
		
		st.age = 40;
		st.name = "static 클래스";
		
		System.out.println(st.age);
		System.out.println(st.name);
		
		StaticClass.StaticBasic.method();
		
	
	}
}
