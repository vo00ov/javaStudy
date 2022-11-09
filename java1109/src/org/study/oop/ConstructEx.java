package org.study.oop;

public class ConstructEx {

	private String userId;
	private String userPw;
	private int age;
	
	//getters, setters
	
	public ConstructEx(){
		System.out.println("===기본 생성자===");
	}
	
	public ConstructEx(String userId) {
		System.out.println("===생성자2===");
		this.userId = userId;
	}
	
	public ConstructEx(String userId, String userPw) {
		System.out.println("===생성자3===");
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public ConstructEx(String userId, String userPw, int age) {
		System.out.println("===생성자4===");
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
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
	
//	@Override
//	public String toString() {
//		
//		String info = ("ID : " + userId + " PW : " + userPw + " 나이 : " + age );
//		return info;
//	}
	
	public void info() {
//		System.out.println("ID : " + userId + " PW : " + userPw + " 나이 : " + age );
		System.out.println("ID : " + userId);
		System.out.println("PW : " + userPw);
		System.out.println("나이 : " + age);
		
	}
	
	
}
