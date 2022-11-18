package com.kh.app.common.db;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.io.Resources;

//import javax.annotation.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JDBCTemplate {
	
	//커넥션 준비 (마이바티스)
	public static SqlSession getSqlSession() {
		
		SqlSession ss = null;
		
		try {
			
			//공장 얻어내는 코드
			String resource = "/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//공장을 가지고서 오픈 세션을 얻어냄
			//false :: 오토커밋 끄기
			ss = sqlSessionFactory.openSession(false);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return ss;
		
	}
	
	//커넥션 준비
	public static Connection getConnetion() {
		
		Connection conn = null;
		
		try {
			
			//드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//커넥션 얻기(url, username, pwd)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "C##MYBATIS";
			String pwd = "MYBATIS";
			conn = DriverManager.getConnection(url, username, pwd);
			
			//오토커밋 끄기
			conn.setAutoCommit(false);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//커넥션 리턴
		return conn;
		
	}
	
	//commit
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//rollback
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//close * 3
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
