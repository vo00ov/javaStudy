package org.study.package1;

//접근지정자 생략, 기본
class ModifyEx02 {

	public int num1_1;
	private int num2_1;
	protected int num3_1;
	int num4_1;
	
	public void setNum2_1(int num2_1) {
		this.num2_1 = num2_1;
	}
	public int getNum2_1() {
		return num2_1;
	}
}
