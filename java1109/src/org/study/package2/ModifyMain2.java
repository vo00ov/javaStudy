package org.study.package2;

import org.study.package1.ModifyEx01;

//다른 패키지
public class ModifyMain2 {

	public static void main(String[] args) {
		
		ModifyEx01 m1 = new ModifyEx01();
		
		m1.num1 =100;
		m1.m1();
		
//		new ModifyEx02();
	}
}
