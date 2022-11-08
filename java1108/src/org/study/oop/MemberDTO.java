package org.study.oop;

public class MemberDTO {

	private String userId;
	private String userPw;
	private int age;
	
	//Scanner 이용해서 회원가입 하고 회원가입 정보를 콘솔에 출력
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
