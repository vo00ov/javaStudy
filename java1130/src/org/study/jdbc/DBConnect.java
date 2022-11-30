package org.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		
		Connection conn = null;	// DB연결
		
		String driver = "oracle.jdbc.driver.OracleDriver";	// 오라클 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 오라클 기본 DB
		String user = "system";	// user ID
		String password = "1234"; // user PW
		
		
		// 1.driver 찾기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver O");
			
			// 2. DB연결 -> xe
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB O");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver X");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB X");
		} 
		
		System.out.println(conn);
		
		if(conn!=null) {
			System.out.println("연동 O");
		}else {
			System.out.println("연동 X");
		}
		
	}
}
