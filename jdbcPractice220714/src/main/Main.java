package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import dto.EmployeeDto;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.print("money : ");
		int money = sc.nextInt();

		System.out.println("===== JDBC TEST =====");

		// 클래스 파일 준비
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##KH";
		String pwd = "KH";

		// 연결하기
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		// 쿼리를 변수에 담아서 준비
		String sql = "SELECT * FROM EMPLOYEE WHERE SALARY > ? ";
		
		// SQL문 작성
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, money);
		
		// 쿼리 실행 및 실행결과 저장 SELECT 구문을 수행할 때 사용되는 함수이므로 괄호 안에 인자값 없음
		ResultSet rs = pstmt.executeQuery();
		
		// 결과 실행
		while(rs.next())
		{
			//객체 생성
			EmployeeDto dto = new EmployeeDto();
			
			dto.setEmpId(rs.getString("EMP_ID"));
			dto.setEmpName(rs.getString("EMP_NAME"));
			dto.setEmail(rs.getString("EMAIL"));
			dto.setHireDate(rs.getTimestamp("HIRE_DATE"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setSalary(rs.getInt("SALARY"));
			
			System.out.println(dto);
		}
		
		
		
		
		
	}

}
