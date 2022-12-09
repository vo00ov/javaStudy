package org.project.dto;

public class Member1207Dto {

	private String userId;
	private String userPw;
	private int age;
	private String email;

	public Member1207Dto(String userId, String userPw, int age, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
