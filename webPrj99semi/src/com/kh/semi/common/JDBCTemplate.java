package com.kh.semi.common;

import java.awt.Taskbar.State;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	//getConnection
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			//라이브러리, 클래스등록, driver
			//프로퍼티즈 파일 읽기 :: Map 계열의 컬렉션
			Properties prop = new Properties();
			
			
			String filePath = JDBCTemplate.class.getResource("/db/info.properties").getPath();// 최상단 경로 찾는 코드?
			prop.load(new FileInputStream(filePath));
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);		
			
		}catch (Exception e) {
			System.out.println("[ERROR] getConnection 중 예외 발생");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//commit
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
				
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] JDBCTemplate");
			e.printStackTrace();
		}
	}
	
	
	//rollback
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] JDBCTemplate");
			e.printStackTrace();
		}
	}
	
	//close * 3
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
				
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] JDBCTemplate");
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt ) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
				
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] JDBCTemplate");
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs ) {
		try {
			if(rs != null && !rs.isClosed()) {
				rs.close();
				
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR] JDBCTemplate");
			e.printStackTrace();
		}
	}
	
	
}
