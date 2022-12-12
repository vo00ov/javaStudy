package org.project.dto;

public class MemberDto {

	private String userId; // 기본키
	private String userPw;
	private String email;

	
	// 아이디 중복체크
	public MemberDto(String userId) {
		super();
		this.userId = userId;
	}

	// 로그인
	public MemberDto(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	// 테이블 연결
	public MemberDto(String userId, String userPw, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
