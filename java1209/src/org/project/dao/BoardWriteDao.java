package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.Board01Dto;

public class BoardWriteDao {

	Connection conn = DBConnect.getConnection();
	PreparedStatement pstm = null;
	String sql = "";

	
	// 게시글 작성
	public int insertDo(String bTitle, String bContent, String userId) {
		int result = 0;
		
		try {

			sql = "insert into board01(bid, bTitle, bContent, userId) values(board01_SEQUENCE.nextval, ?, ? ,?)";
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, bTitle);
			pstm.setString(2, bContent);
			pstm.setString(3, userId);
			
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

	// 게시글 수정
	public int updateDo(int bId, String bTitle, String bContent, String userId) {
		int result = 0;
		
		try {

			sql = "update board01 set bTitle=?,bContent=? WHERE userId=? and bid=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, bTitle);
			pstm.setString(2, bContent);
			pstm.setString(3, userId);
			pstm.setInt(4, bId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			} finally {
				
			}
		}
		
		return result;
	}
	
	// 게시글 삭제
	public int deleteDo(String bTitle, String userId, int bId) {
		int result = 0;
		
		try {
			sql = "DELETE from board01 where bid=? and bTitle=? and userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, bId);
			pstm.setString(2, bTitle);
			pstm.setString(3, userId);
			
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

	// 검색 (조회)
	public ArrayList<Board01Dto> selectDo(String choice,String find) {
		ArrayList<Board01Dto> list = new ArrayList<Board01Dto>();
		ResultSet rs = null;
		
		
		if(choice.equals("전체")) {
			try {
				sql = "select * from board01 order by bId desc";
				pstm = conn.prepareStatement(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		} else if(choice.equals("all")) {
			sql = "select * from board01 where bTitle like '%'||?||'%' or userId like '%'||?||'%' order by bId desc";
			try {
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, find);
				pstm.setString(2, find);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		} else if(choice.equals(choice)) {
			try {
				sql = "select * from board01 where " + choice +  " like '%'||?||'%' order by bId desc";
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, find);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					list.add(new Board01Dto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
			
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return list;
	}

	
	
	

}
