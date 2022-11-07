package org.study.oop;

//접근지정자 class 클래스명
public class ClassBasic {

	// 필드, 속성, 프로퍼티
	// 접근지정자 타입 필드명;
	public String userId;
	public String userPw;
	public int age;
	
	// 생성자 -> construct
//	public ClassBasic() {
//		System.out.println("생성(기본)");
//	}
	
	// 접근지정자 반환타입 메서드명(매개인자,,)
	public void instanceMethod() {
		System.out.println("메서드 (인스턴스)");
	}
	
}
