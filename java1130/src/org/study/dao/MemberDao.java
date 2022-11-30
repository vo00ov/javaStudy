package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.study.dbconnect.DBConnect;

public class MemberDao {

	public MemberDao() {
		System.out.println("Dao");
	}

	public int insert(String userId, String userPw, int age) {
		int result = 0;
		Connection conn = null;	// DB연동
		PreparedStatement pstm = null;	// SQL처리
		String query = "";	// 쿼리문
		
		
		try {
			// 1.DB연동
			// 1-1 드라이버 찾기
			// 1-2 드라이버 연결
			conn = DBConnect.getConnection();	// Conncet null -> 연결 X
			query = "insert into member(userId, userPw, age) values(?,?,?)";

			// 2.SQL실행
			pstm = conn.prepareStatement(query);	// DB연동 쿼리 실행
			
			// DB table insert
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			
			// 3.실행, 결과반환
			result = pstm.executeUpdate(); // 성공1, 실패 나머지
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(conn!=null) conn.close();
					if(pstm!=null) pstm.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					
				}
		}
		return result;
	}

}
