package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.project.dbconnect.DBConnect;

public class BoardDao {

	Connection conn = null;
	PreparedStatement pstm = null;
	String sql = "";
	
	// 게시글 작성
	public int insertDo(String writeId, String bContent) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into board1207 values(bId_seq.nextval,?,?)";
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, writeId);
			pstm.setString(2, bContent);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(conn != null) pstm.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
	}

}
