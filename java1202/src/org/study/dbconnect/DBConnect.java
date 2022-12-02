package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		try {
			// 1.driver 찾기
			Class.forName(driver);
			System.out.println("Driver Ok");
			// 2.DB연동
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver X");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연동 X");
		}

		return conn;
	}
}
