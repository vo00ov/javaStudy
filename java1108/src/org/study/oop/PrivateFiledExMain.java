package org.study.oop;

public class PrivateFiledExMain {

	public static void main(String[] args) {
		
		PrivateFiledEx ins1 = new PrivateFiledEx();
		
		ins1.addr = "서울시 노원구";
		
		ins1.setUserID("m111");
		String userId = ins1.getUserID();
		System.out.println("ID : " + userId);
		
		ins1.setUserPw("1111");
		String userPw = ins1.getUserPw();
		System.out.println("PW : " + userPw);
		
		ins1.setUserAge(20);
		int userAge = ins1.getUserAge();
		System.out.println("Age : " + userAge);
	}
	
}
