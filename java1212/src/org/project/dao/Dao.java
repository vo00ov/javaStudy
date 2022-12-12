package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.BoardDto;
import org.project.dto.MemberDto;

public class Dao {
	// 싱글톤
	// Dao객체를 한번만 생성 할 수 있다
	private static final Dao INSTANCE = new Dao();
	// 생성자 private
	private Dao() {
		System.out.println("기본 생성자");
	}
	
	public static Dao getInstance() {
		return INSTANCE;
	}

	
	
	
	Connection conn = null;
	PreparedStatement pstm = null;
	String sql = "";
	
	// 회원가입
	public int insertDo(String userId, String userPw, String email) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member1212(userId,userPw,email) values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
			result = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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


	
	// 회원 조회
	public ArrayList<MemberDto> selectDo() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member1212";
			pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					list.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
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

	// 로그인
	public int loginOkDo(String userId, String userPw) {
		int result = 0;
		ResultSet rs = null;		
		
		try {
			conn = DBConnect.getConnection();
			sql = "select count(*) from member1212 where userId = ? and userPw = ? ";		
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					result = rs.getInt(1);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		
		
		return result;
	}

	public int writeDo(String bTitle, String bContent, String nickName, String bWriteId) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into board1212(no,bTitle, bContent, nickName, bTime, bWriterId) values(board1212_sequence.nextval,?,?,?,SYSDATE,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, bTitle);
			pstm.setString(2, bContent);
			pstm.setString(3, nickName);
			pstm.setString(4, bWriteId);
			
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		return result;
	}

	// 특정 검색 조회
	public ArrayList<BoardDto> boardListDo(String id) {
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from board1212 b join member1212 m on b.bWriterId=m.userId where userId=? order by no desc";
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					list.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
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
			} finally {
				
			}
		}
		
		
		
		return list;
	}
	
	
	
}
