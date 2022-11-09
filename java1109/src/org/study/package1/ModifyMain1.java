package org.study.package1;

//같은 패키지
public class ModifyMain1 {

	public static void main(String[] args) {
		
		ModifyEx01 m1 = new ModifyEx01();
		m1.num1 = 1;
		m1.setNum2(2);
		m1.num3 = 3;
		m1.num4 = 4;
		
		ModifyEx02 m2 = new ModifyEx02();
		m2.num1_1 = 10;
		m2.setNum2_1(20);
		m2.num3_1 = 30;
		m2.num4_1 = 40;
	}
}
