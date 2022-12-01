package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public int insertDo(String userId, String userPw, int age) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member(userId,userPw,age) values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		
		return result;
	}
	
	public int updateDo(String userId, String userPw, int age) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "update MEMBER set userPw=?,age=? WHERE userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		return result;
	}
	
	public int deleteDo(String userId) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "DELETE from MEMBER where userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
			
		}
		
		return result;
	}
	
//	public ArrayList<MemberDto> selectDo() {
	public ArrayList<MemberDto> selectDo(String userId) {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;	// DB데이터를 저장 할 객체
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member where userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setNString(1, userId);
			
			rs = pstm.executeQuery(); // DB데이터를 저장
			// DB데이터가 없으면 null
			
			if(rs != null) {
				while(rs.next()) {
					userId = rs.getString(1);
//					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					
					lists.add(new MemberDto(userId, userPw, age));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return lists;
		
	}

}
