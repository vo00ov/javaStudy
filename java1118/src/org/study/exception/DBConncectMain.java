package org.study.exception;

import org.study.connect.DBConnect;

public class DBConncectMain {

	public static void main(String[] args) {
		
		//getConnection 메서드 실행(static)
		
		DBConnect.getConnection();
	}
}
