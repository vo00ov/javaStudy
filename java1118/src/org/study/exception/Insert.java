package org.study.exception;

import java.sql.SQLException;

public class Insert implements Exception9{

	@Override
	public void excute() throws ClassNotFoundException, SQLException {
		System.out.println("회원가입");
	}

}
