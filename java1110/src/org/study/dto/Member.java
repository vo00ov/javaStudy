package org.study.dto;

public class Member {

	private String userId;
	private String userPw;
	private int userAge;
	private String email;

	
	
	public Member(String userId, String userPw, int userAge, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
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

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
