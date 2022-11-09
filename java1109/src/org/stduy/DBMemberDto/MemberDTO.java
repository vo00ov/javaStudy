package org.stduy.DBMemberDto;

//회원가입 멤버 (저장, 출력)
public class MemberDTO {

	private String userId;
	private String userPw;
	private int userAge;
	private String userName;
	private String userAddr;
	
	public MemberDTO(String userId, String userPw, int userAge, String userName, String userAddr) {
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userName = userName;
		this.userAddr = userAddr;
		
//		info(); // 저장하자 마자 호출
	}
	
	public void info() {
		System.out.println("ID : " + userId);
		System.out.println("PW : " + userPw);
		System.out.println("AGE : " + userAge);
		System.out.println("NAME : " + userName);
		System.out.println("ADDR : " + userAddr);
		System.out.println();
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	
	
	
}
