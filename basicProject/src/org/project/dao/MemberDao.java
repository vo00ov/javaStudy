package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {

	Scanner sc = new Scanner(System.in);
	String sql = "";
	Connection conn = null;
	PreparedStatement pstm = null;
	//생성
	public int insertDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into member1206(userId,userPw,age,email) values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	//수정
	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		try {
			conn = DBConnect.getConnection();
			sql = "update MEMBER1206 set userPw=?,age=?,email=? WHERE userId=?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userId);
			
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

	// 삭제
	public int deleteDo(String userId) {
		int result = 0;
		System.out.println("삭제?y/n");
		String yn = sc.next();
		if(yn.equals("y")) {		
			try {
				conn = DBConnect.getConnection();
				sql = "DELETE from MEMBER1206 where userId=?";
				
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
		}else if(yn.equals("n")) {
		}else {
			System.out.println("입력값 오류");
		}
		
		
		return result;
	}

	public ArrayList<MemberDto> selectDo(String userId) {
		ArrayList<MemberDto> users = new ArrayList<MemberDto>();
		
		ResultSet rs = null;
		conn = DBConnect.getConnection();
		
		if(userId.equals("")) {
			sql = "select * from member1206";
			try {
				pstm=conn.prepareStatement(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				
			}
		}else {
//			sql = "select * from member1206 where userId=?";
			sql = "select * from member1206 where userId like '%'||?||'%'";
			try {
				pstm=conn.prepareStatement(sql);
				pstm.setString(1, userId);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				
			}
			
		}
		
		try {
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					users.add(new MemberDto(userId, userPw, age, email));
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
			
		
		return users;
	}
	
	//search
	public ArrayList<MemberDto> searchDo(String userId) {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			sql = "select * from member1206 where userId like '%'||?||'%'";
//			sql = "select * from member1206 where userId like '%"+ userId + "%'";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userId);
			rs = pstm.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					lists.add(new MemberDto(userId, userPw, age, email));
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
		
		
		return lists;
	}
	
	


	
	
	
	
	
	
	
	

}
