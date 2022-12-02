package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public int insertDo(String userId, String userPw, int age, String email) {
		int result = 0;

//		System.out.print(userId + " ");
//		System.out.print(userPw + " ");
//		System.out.print(age + " ");
//		System.out.println(email + " ");

		// 회원가입
		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";

		try {
			conn = DBConnect.getConnection();
			sql = "insert into MEMBER2(userId, userPw, age, email) VALUES(?,?,?,?)";
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
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		}

		return result;
	}

	// 회원수정
	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";

		try {
			conn = DBConnect.getConnection();
			sql = "update member2 set userPw=?,age=?,email=? where userId=?";
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
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		}
		return result;
	}

	// 회원삭제
	public int deleteDo(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";

		try {
			conn = DBConnect.getConnection();
			sql = "delete from member2 where userId=?";
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, userId);

			pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		}

		return result;
	}

	// 전체회원조회

	public ArrayList<MemberDto> selectDo(String userId) {
		ArrayList<MemberDto> users = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String sql = "";
		ResultSet rs = null;

		conn = DBConnect.getConnection();
		if (userId.equals("")) {

			try {
				sql = "select * from member2";
				pstm = conn.prepareStatement(sql);

//				pstm.setString(1, userId);

				rs = pstm.executeQuery();

				if (rs != null) {
					while (rs.next()) {
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
					if (conn != null)
						conn.close();
					if (pstm != null)
						pstm.close();
					if (rs != null)
						rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
			}
		} else {
			
			try {

				sql = "select * from member2 where userId = ?";
				pstm = conn.prepareStatement(sql);

				pstm.setString(1, userId);

				rs = pstm.executeQuery();

				if (rs != null) {
					while (rs.next()) {
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
					if (conn != null)
						conn.close();
					if (pstm != null)
						pstm.close();
					if (rs != null)
						rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
			}
			
		}
		return users;
	}

}
