package org.stduy.collection;

public class MemberDto {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	
	// 생성자
	public MemberDto(String userId, String userPw, String userName, int userAge) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	// getter, setter
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
//	@Override // toString 오버라이딩하면 자동호출 (암묵적인 룰)
//	public String toString() {
//		String user = "ID : " + userId
//					+ ", PW : " + userPw
//					+ ", NAME : " + userName
//					+ ", AGE : " + userAge;
//		return user;
//	}
}
