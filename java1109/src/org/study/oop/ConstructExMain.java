package org.study.oop;

public class ConstructExMain {

	public static void main(String[] args) {
		
		ConstructEx c1 = new ConstructEx();		
		c1.setUserId("m1");
		c1.setUserPw("11");
		c1.setAge(1);
		
//		System.out.println(c1.toString());
		c1.info();


		ConstructEx c2 = new ConstructEx("m2");
		c2.setUserPw("22");
		c2.setAge(2);
		
		c2.info();
		

		
		ConstructEx c3 = new ConstructEx("m3", "33");
		c3.setAge(3);
	
		c3.info();

		
		ConstructEx c4 = new ConstructEx("m4", "44", 4);
		c4.info();

	}
	
}
