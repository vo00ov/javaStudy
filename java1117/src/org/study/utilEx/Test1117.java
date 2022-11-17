package org.study.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {

	public static void main(String[] args) {
		
		
		try {
			// class 를 찾는 ~ Oracle JDBC 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Connect Success");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Oracle Driver Connect Fail");
		}
		
		// 1.날짜 생성
		Date now = new Date();
		// 2.포맷
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// 3.포맷(날짜)
		String day = format.format(now);
		System.out.println(day);
		
	}
}
