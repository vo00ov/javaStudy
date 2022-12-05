package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	//생성
	public int insertDo(String userId, String userPw, int age, String email) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "insert into MEMBER1(userId, userPw, age, email) VALUES(?,?,?,?)";
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
				if(conn != null) conn.close();
				if(pstm != null) pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
		
		
		
		return result;
	}
	
	
	
	//삭제
	public int deleteDo(String userId) {
		int result = 0 ;
		Connection conn = null;
		String sql = "";
		PreparedStatement pstm = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제하시겠습니까?(y/n)");
		String yn = sc.next();
		
		if(yn.equals("y")) {
			
			try {
				conn = DBConnect.getConnection();
				sql = "DELETE from MEMBER1 where userId = ?";
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
			System.out.println("입력 오류");
		}
		return result;
		
	}
	
	
	
	
	//수정
	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		
		try {
			conn = DBConnect.getConnection();
			sql = "update MEMBER1 set userPw=?,age=?,email=? WHERE userId=?";
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
	
	
	
	
	
	//조회
	public ArrayList<MemberDto> selectDo(String userId) {
		ArrayList<MemberDto> users = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		conn = DBConnect.getConnection();
		if(userId.equals("")) {
			try {
				sql = "select * from member1";
				pstm = conn.prepareStatement(sql);
				
				rs = pstm.executeQuery();
				
				if(rs != null) {
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
			}finally {
				try {
					if(conn != null) conn.close();
					if(pstm != null) pstm.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					
				}
			}
		}else {
			try {
				sql = "select * from member1 where userId = ?";
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, userId);
				
				rs = pstm.executeQuery();
				
				if(rs != null) {
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
			}finally {
				try {
					if(conn != null) conn.close();
					if(pstm != null) pstm.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					
				}
			}
		}
		
		
		
		return users;
	}


	// 나이 조회
	public List<MemberDto> selectAge(int ageStart, int ageEnd) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;
		
		
		try {
			conn = DBConnect.getConnection();
//			sql = "select * from member1 where age>=? and age<?";
			sql = "select * from member1 where age between ? and ?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, ageStart);
			pstm.setInt(2, ageEnd);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					list.add(new MemberDto(userId, userPw, age, email));
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
			}finally {
				
			}
		}
		
		
		return list;
	}
	
	
	
	

}
