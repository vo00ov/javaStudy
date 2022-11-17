package org.study.exceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {

		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			
			Class.forName(driver);
			System.out.println("Driver Ok");
			
			conn = DriverManager.getConnection(url, user, password); // 경로, 아이디, 비밀번호가 일치하면 연결성공/하나라도 틀리면 catch
			System.out.println("Connection Success");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Driver Null");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("Connection Fail");
			
		}

		return conn;
	}

}
