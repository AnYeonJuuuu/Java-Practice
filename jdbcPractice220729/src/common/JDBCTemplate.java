package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {

	// 왜 6개의 메소드 중 getConnection만 예외 던지는가?
	
	// 아래 5개 메소드가 트라이캐치가 되어있지 않다면? -> 멤버서비스에서  커밋 부분에 예외 발생
	
	// 커넥션 가져오기
	public static Connection getConnection() throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##MINI";
		String pwd = "MINI";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,id,pwd);
		conn.setAutoCommit(false);		
		
		return conn;
		
	}
	/*
	 * 1. try catch 처리
	 * 2. null 체크
	 */
	
	// 커밋
	public static void commit(Connection conn) {
			try {
				if(conn!=null)conn.commit(); //커넥션이 아닐 때 커밋하도록
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	// 롤백 //conn.rollback : 자동완성을 이용!
	public static void rollback(Connection conn) {
			try {
				if(conn != null) conn.rollback(); //커넥션이 아닐 때 롤백하도록
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	// close : conn, rs, stmt (1. try catch 2.null 체크 작업)
	public static void close(Connection conn) {
		try {
			if(conn != null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null)rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if( stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
