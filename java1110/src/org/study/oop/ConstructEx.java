package org.study.oop;

public class ConstructEx {

	private int num1;
	private int num2;
	private String op;

	public ConstructEx() {
		this(200,300);
		System.out.println("기본생성자");
	}
	
	public ConstructEx(int num1, int num2) {
		System.out.println("생성자 2");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public ConstructEx(int num1, int num2, String op) {
		System.out.println("생성자 3");
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

}
