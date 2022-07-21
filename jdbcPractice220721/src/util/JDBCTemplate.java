package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";

			conn = DriverManager.getConnection(/* 연결에 필요한 정보 */ url, id, pwd);
			conn.setAutoCommit(false); // 항상 이용!!
			
		} catch (Exception e) {
			System.out.println("커넥션 가져오기 실패!");
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	//connection 클로즈
	public static void close(Connection conn) {
		try {
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Statement 클로즈
	public static void close(Statement stmt) {
		try {
			if(stmt != null) {
			stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// PreparedStatement 굳이 안 만들어도 됨! 왜? Statement를 상속받고 있기 때문에
	public static void close(ResultSet rs) {
		try {
			if(rs != null) {
			rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		if(conn != null) {
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn) {
		if(conn != null) {
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}

