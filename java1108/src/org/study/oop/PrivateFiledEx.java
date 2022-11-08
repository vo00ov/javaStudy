package org.study.oop;

public class PrivateFiledEx {

	private String userID;
	private String userPw;
	private int userAge;
	public String addr;
	
	

	//setters, getters
	
	public String getUserID() {
	//getter ->private 필드를 외부에 초기화 메서드
		return userID;
	}
	//setter-> private 필드를 외부에 초기화 메서드
	public void setUserID(String userID) {
		this.userID = userID;
			//필드 	//매개변수(외부입력)
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
	
}
