package org.study.oop;

public class ConstructEx1 {

	private String userId;
	private String userPw;
	private int age;
	
	
	//컴파일러가 자동으로 기본생성자를 생성
	public ConstructEx1() {
		this("ss1111");
		System.out.println("기본생성자");
		
	}
	
	//메서드 오버로딩
	public ConstructEx1(String userId) {
		this("m111", "1111");
		System.out.println("생성자 ConstructEx1(String userId)");
		System.out.println(userId);
	}
	
	//메서드 오버로딩
	public ConstructEx1(String userId, String userPw) {
		System.out.println("생성자 ConstructEx1(String userId, String userPw)");
		System.out.println(userId);
		System.out.println(userPw);
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
