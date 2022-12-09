package org.project.dto;

public class Board01Dto {

	private int bId;
	private String bTitle;
	private String bContent;
	private String userId;

	public Board01Dto(int bId, String bTitle, String bContent, String userId) {
		super();
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.userId = userId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
