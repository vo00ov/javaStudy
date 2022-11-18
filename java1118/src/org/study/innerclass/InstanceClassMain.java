package org.study.innerclass;

import org.study.innerclass.InstancClass.InstancBasic;

public class InstanceClassMain {

	public static void main(String[] args) {
		System.out.println("====내부클래스(인스턴스클래스)====");
		
		InstancClass outC = new InstancClass(); // 외부클래스 생성
		
		outC.age = 20;
		outC.name = "외부클래스";
		
		System.out.println(outC.name);
		
		//외부클래스타입 . 내부클래스			   //내부클래스 객체생성
		InstancClass.InstancBasic inC = outC.new InstancBasic();
		
		inC.age = 10;
		inC.name = "내부클래스";
		
		System.out.println(inC.name);
		
		InstancClass.InstancBasic inC2 = new InstancClass().new InstancBasic();
		
		inC2.age = 30;
		inC2.name = "내부클래스2";
		
		System.out.println(inC2.name);
		
	}
}
