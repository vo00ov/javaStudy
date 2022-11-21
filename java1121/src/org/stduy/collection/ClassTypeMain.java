package org.stduy.collection;

import java.util.Date;

public class ClassTypeMain {
	
	public static void main(String[] args) {
					//객체생성
		ClassType ct = new ClassType();
		// 타입   객체참조변수(객체의 주소저장)
		
		// 기본타입(premitive)
		ct.num1 = 100;
		
		// 객체타입
//		c1.name = new String("이름")
		ct.name = "String";
		ct.obj = new Object();
		ct.day = new Date();

//		private 멤버 -> setter, getter
		ct.setId("mmm");;
		ct.getId();
	}

}
