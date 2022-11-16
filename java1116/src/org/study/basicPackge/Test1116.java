package org.study.basicPackge;

public class Test1116 {
	
	public static void main(String[] args) {
		/*
		 * 표준 입출력 
		 * System.in; // 입력 
		 * System.out // 출력
		 */		

//		try {
//			Class.forName("Oracle.jdbc.driver.OracleDriver");
//			System.out.println("DB Connect Success");
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("DB Connect Fail");
//		}
		
		
		//Wrapper 클래스
		int i = 10;
		Integer i1 = new Integer(i);	// 박싱
		int i2 = i1.intValue();			// 언박싱
		
		Integer j1 = 10; 				// 자동박싱
		int a = new Integer(10);		// 자동언박싱
		
		//String 문자열, 수정X
		String str = "java 2022 Project";
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.contains("2"));
		System.out.println(str.contains("z"));
		System.out.println(str.replace("java", "Oracle"));
		System.out.println(str);
		
		String[] arrStr = str.split(" ");
		System.out.println(arrStr.length);
		//foreach
		
		System.out.println("===foreach===");
		for(String arr : arrStr) {
			System.out.println(arr);
		}
		//for
		System.out.println("=====for=====");
		for(int j = 0; j<arrStr.length; j++) {
			System.out.println(arrStr[j]);
		}
		System.out.println("===substring====");
		
		//"java 2022 Project
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(0));	// 시작 인덱스부터 추출
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 5));// 시작인덱스 ~ 마지막인덱스-1
	}

	
}
