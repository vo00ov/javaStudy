package org.study.oop;

public class Caculator {

	public int num1;
	public int num2;
	public String op;
	public String yn;
	
	public static final String PROJECTNAME="Caculator";
	
	// 매개변수 3개(num1, num2, op)
	
	// +
	public void sum() {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	// -
	public void sub() {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}
	// *
	public void muti() {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}
	// /
	public void dev() {
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
	}
	// %
	public void rem() {
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}
	
	public void yesOrNo() {
		System.out.println("실행하시겠습니까?");
	}
	
	public void yes() {
		System.out.println("실행합니다");
	}
	
	public void no() {
		System.out.println("프로그램 종료");
	}
}
