package org.stduy.collection;

import java.util.Date;

// 접근지정자 class 클래스명{}
public class ClassType {
	// 클레스의 멤버
	
	// 필드, 프로퍼티, 속성
	public int num1;
	public String name;
	public Object obj;
	public Date day;
	private String id;
	
	// 생성자(construct)
	public ClassType() {
		System.out.println("기본생성자(생략가능)");
	}
	
	// 메서드
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
