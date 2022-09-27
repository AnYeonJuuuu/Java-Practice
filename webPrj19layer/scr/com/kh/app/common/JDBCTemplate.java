package com.kh.app.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	// 커넥션 생성
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "C##SEMI";
			String password = "SEMI";
			
			
			Class.forName(driver);
			
			//커넥션 얻어오기
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return conn;

	}
	
	// 커밋
	public static void commit(Connection conn){
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 롤백
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// close // conn, stmt, rs
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
			stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null && !rs.isClosed()) {
			rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

			
	
	
}
