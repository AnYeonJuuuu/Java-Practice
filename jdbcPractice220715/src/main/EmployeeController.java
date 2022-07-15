package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.EmployeeDto;

public class EmployeeController {

public void selectEmployeeList() {
		
		Connection conn = null;
		//sql ����ִ� ��ü
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			System.out.println("===== JDBC TEST =====");

			// Ŭ���� ���� �غ�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ���� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";

			// ���� ��� : � Ŀ�ؼ��� ���� �� ������ ���� 3�� ����� ���⼭ ���� 3�� ����
			// �ڹٿ� db�� ����
			conn = DriverManager.getConnection(url, id, pwd); // Ŀ�ؼ��� ����.


			// ����� ���� �غ�
			String sql = "SELECT * FROM EMPLOYEE";

			// (sql�� ���� �� �ִ� ���� = )Statement �غ�
			// preparedStatement �� ���ڿ��� ''�� ���� ������ �ʾƵ� ��(���ʿ� �̻��� �� ������ ���ϵ��� �Ǿ� ����.)
			pstmt = conn.prepareStatement(sql);
			
			// ���� ���� �� ������ ����(SELECT �̹Ƿ� ResultSet���� ��������)
			rs = pstmt.executeQuery(); // ������ ������ �������� �� ! / ��Ī ���� ����

			
			while (rs.next()) {

				EmployeeDto dto = new EmployeeDto();// �⺻������ �̿�
				/* �Ķ���� �ִ� �����ڸ� ���� �ʰ� �⺻ ������ ����� ���� 
				: Į�� ���� ���� �� ���� ���� ����(������ ������ �����Ƿ� Ȯ�� �ؾ� �� ���� ����)
				 Į���� ���� ��, �������� ���ϰ� �ϱ� ���� setter ���
				*/
				dto.setEmpId(rs.getString("EMP_ID"));
				dto.setEmpName(rs.getString("EMP_NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setHireDate(rs.getTimestamp("HIRE_DATE"));
				dto.setPhone(rs.getString("PHONE"));
				dto.setSalary(rs.getInt("SALARY"));

				// �ش� ��ü�� ���
				System.out.println(dto);
			}
		}catch(Exception e) {
			System.out.println("��� ��ȸ �� ���� �߻� ! ");
			e.printStackTrace();
		}finally {
			//�ڿ�����
			//Ŭ���� ���ܸ� Ʈ����ĳġ�� ������ -> ������ Ŭ��� �ƴ϶� null�� �ƴ� ���� Ŭ���� �ϵ��� ����.
			//try-catch ���� ���ܰ� �� ���� ���� �ȵǴ� ���� : ù ��° ���ܻ��� �߻� ��, �� ���� ������ �� �Ǳ� ����.
			try{ if(conn != null )conn.close(); }catch(Exception e) {}
			try{ if(pstmt != null )pstmt.close(); }catch(Exception e) {}
			try{ if(rs != null )rs.close(); }catch(Exception e) {}
			
		}
		
		
	}
	
	//���̵� ������ ��� id�� �˻��� �� �ֵ���
	public void selectEmployeeById(String empId) {
		
		Connection conn = null;
		//sql ����ִ� ��ü
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			System.out.println("===== JDBC TEST =====");

			// Ŭ���� ���� �غ�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ���� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";

			// ���� ��� : � Ŀ�ؼ��� ���� �� ������ ���� 3�� ����� ���⼭ ���� 3�� ����
			// �ڹٿ� db�� ����
			conn = DriverManager.getConnection(url, id, pwd); // Ŀ�ؼ��� ����.


			// ����� ���� �غ�
			String sql = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? ";

			// (sql�� ���� �� �ִ� ���� = )Statement �غ�
			// preparedStatement �� ���ڿ��� ''�� ���� ������ �ʾƵ� ��(���ʿ� �̻��� �� ������ ���ϵ��� �Ǿ� ����.)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empId);
			
			// ���� ���� �� ������ ����(SELECT �̹Ƿ� ResultSet���� ��������)
			rs = pstmt.executeQuery(); // ������ ������ �������� �� ! / ��Ī ���� ����

			
			while (rs.next()) {

				EmployeeDto dto = new EmployeeDto();// �⺻������ �̿�
				/* �Ķ���� �ִ� �����ڸ� ���� �ʰ� �⺻ ������ ����� ���� 
				: Į�� ���� ���� �� ���� ���� ����(������ ������ �����Ƿ� Ȯ�� �ؾ� �� ���� ����)
				 Į���� ���� ��, �������� ���ϰ� �ϱ� ���� setter ���
				*/
				dto.setEmpId(rs.getString("EMP_ID"));
				dto.setEmpName(rs.getString("EMP_NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setHireDate(rs.getTimestamp("HIRE_DATE"));
				dto.setPhone(rs.getString("PHONE"));
				dto.setSalary(rs.getInt("SALARY"));

				// �ش� ��ü�� ���
				System.out.println(dto);
			}
		}catch(Exception e) {
			System.out.println("��� ��ȸ �� ���� �߻� ! ");
			e.printStackTrace();
		}finally {
			//�ڿ�����
			//Ŭ���� ���ܸ� Ʈ����ĳġ�� ������ -> ������ Ŭ��� �ƴ϶� null�� �ƴ� ���� Ŭ���� �ϵ��� ����.
			//try-catch ���� ���ܰ� �� ���� ���� �ȵǴ� ���� : ù ��° ���ܻ��� �߻� ��, �� ���� ������ �� �Ǳ� ����.
			try{ if(conn != null )conn.close(); }catch(Exception e) {}
			try{ if(pstmt != null )pstmt.close(); }catch(Exception e) {}
			try{ if(rs != null )rs.close(); }catch(Exception e) {}
			
		}
		
		
	}
	
}
