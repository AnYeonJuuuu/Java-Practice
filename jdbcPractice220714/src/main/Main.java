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

		// Ŭ���� ���� �غ�
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##KH";
		String pwd = "KH";

		// �����ϱ�
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		// ������ ������ ��Ƽ� �غ�
		String sql = "SELECT * FROM EMPLOYEE WHERE SALARY > ? ";
		
		// SQL�� �ۼ�
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, money);
		
		// ���� ���� �� ������ ���� SELECT ������ ������ �� ���Ǵ� �Լ��̹Ƿ� ��ȣ �ȿ� ���ڰ� ����
		ResultSet rs = pstmt.executeQuery();
		
		// ��� ����
		while(rs.next())
		{
			//��ü ����
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
