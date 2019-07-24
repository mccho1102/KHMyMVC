package ncs.memberList.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class NcsMemberDAO {

	private DataSource ds; // DataSource ds 는 아파치톰캣이 제공하는 DBCP(DB Connection Pool) 이다.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public NcsMemberDAO() {

		try {

			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/myoracle");

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}

			if (pstmt != null) {
				pstmt.close();
				pstmt = null;
			}

			if (conn != null) {
				conn.close();
				conn = null;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

// *** (요구사항4) int memberRegister(MemberVO mvo) 
//	throws SQLException 메소드를 생성하시오 *** //
	
	public int memberRegister(MemberVO mvo) throws SQLException{
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "";
		
		try {
			conn = ds.getConnection();
			
			// 여기다 코드 작성
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public List<MemberVO> memberVOList() throws SQLException{
		
		List<MemberVO> memberVOList = null;
		
		try {
			conn = ds.getConnection();
			String query = "";
			
			// 여기다 코드 작성
			
		}finally {
			close();
		}
		
		
		return null;
	}
	

}
