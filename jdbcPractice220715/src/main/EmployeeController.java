package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.EmployeeDto;

public class EmployeeController {

public void selectEmployeeList() {
		
		Connection conn = null;
		//sql 담아주는 객체
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			System.out.println("===== JDBC TEST =====");

			// 클래스 파일 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";

			// 연결 얻기 : 어떤 커넥션을 얻어온 것 위에서 변수 3개 만들고 여기서 변수 3개 연결
			// 자바와 db의 연결
			conn = DriverManager.getConnection(url, id, pwd); // 커넥션을 얻어옴.


			// 사용할 쿼리 준비
			String sql = "SELECT * FROM EMPLOYEE";

			// (sql문 날릴 수 있는 종이 = )Statement 준비
			// preparedStatement 는 문자열에 ''를 따로 붙이지 않아도 됨(애초에 이상한 값 들어오지 못하도록 되어 있음.)
			pstmt = conn.prepareStatement(sql);
			
			// 쿼리 실행 및 실행결과 저장(SELECT 이므로 ResultSet으로 가져오기)
			rs = pstmt.executeQuery(); // 실제로 데이터 가져오는 것 ! / 별칭 짓기 가능

			
			while (rs.next()) {

				EmployeeDto dto = new EmployeeDto();// 기본생성자 이용
				/* 파라미터 있는 생성자를 쓰지 않고 기본 생성자 사용한 이유 
				: 칼럼 수가 많을 때 보기 좋지 않음(순서가 정해져 있으므로 확인 해야 할 것이 많음)
				 칼럼이 많을 때, 유지보수 편리하게 하기 위해 setter 사용
				*/
				dto.setEmpId(rs.getString("EMP_ID"));
				dto.setEmpName(rs.getString("EMP_NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setHireDate(rs.getTimestamp("HIRE_DATE"));
				dto.setPhone(rs.getString("PHONE"));
				dto.setSalary(rs.getInt("SALARY"));

				// 해당 객체를 출력
				System.out.println(dto);
			}
		}catch(Exception e) {
			System.out.println("사원 조회 중 예외 발생 ! ");
			e.printStackTrace();
		}finally {
			//자원정리
			//클로즈 예외를 트라이캐치로 감싸줌 -> 무조건 클로즈가 아니라 null이 아닐 때만 클로즈 하도록 써줌.
			//try-catch 블럭에 예외값 한 번에 쓰면 안되는 이유 : 첫 번째 예외사항 발생 시, 뒷 내용 실행이 안 되기 때문.
			try{ if(conn != null )conn.close(); }catch(Exception e) {}
			try{ if(pstmt != null )pstmt.close(); }catch(Exception e) {}
			try{ if(rs != null )rs.close(); }catch(Exception e) {}
			
		}
		
		
	}
	
	//아이디를 가지고 사원 id를 검색할 수 있도록
	public void selectEmployeeById(String empId) {
		
		Connection conn = null;
		//sql 담아주는 객체
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			System.out.println("===== JDBC TEST =====");

			// 클래스 파일 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "C##KH";
			String pwd = "KH";

			// 연결 얻기 : 어떤 커넥션을 얻어온 것 위에서 변수 3개 만들고 여기서 변수 3개 연결
			// 자바와 db의 연결
			conn = DriverManager.getConnection(url, id, pwd); // 커넥션을 얻어옴.


			// 사용할 쿼리 준비
			String sql = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? ";

			// (sql문 날릴 수 있는 종이 = )Statement 준비
			// preparedStatement 는 문자열에 ''를 따로 붙이지 않아도 됨(애초에 이상한 값 들어오지 못하도록 되어 있음.)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empId);
			
			// 쿼리 실행 및 실행결과 저장(SELECT 이므로 ResultSet으로 가져오기)
			rs = pstmt.executeQuery(); // 실제로 데이터 가져오는 것 ! / 별칭 짓기 가능

			
			while (rs.next()) {

				EmployeeDto dto = new EmployeeDto();// 기본생성자 이용
				/* 파라미터 있는 생성자를 쓰지 않고 기본 생성자 사용한 이유 
				: 칼럼 수가 많을 때 보기 좋지 않음(순서가 정해져 있으므로 확인 해야 할 것이 많음)
				 칼럼이 많을 때, 유지보수 편리하게 하기 위해 setter 사용
				*/
				dto.setEmpId(rs.getString("EMP_ID"));
				dto.setEmpName(rs.getString("EMP_NAME"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setHireDate(rs.getTimestamp("HIRE_DATE"));
				dto.setPhone(rs.getString("PHONE"));
				dto.setSalary(rs.getInt("SALARY"));

				// 해당 객체를 출력
				System.out.println(dto);
			}
		}catch(Exception e) {
			System.out.println("사원 조회 중 예외 발생 ! ");
			e.printStackTrace();
		}finally {
			//자원정리
			//클로즈 예외를 트라이캐치로 감싸줌 -> 무조건 클로즈가 아니라 null이 아닐 때만 클로즈 하도록 써줌.
			//try-catch 블럭에 예외값 한 번에 쓰면 안되는 이유 : 첫 번째 예외사항 발생 시, 뒷 내용 실행이 안 되기 때문.
			try{ if(conn != null )conn.close(); }catch(Exception e) {}
			try{ if(pstmt != null )pstmt.close(); }catch(Exception e) {}
			try{ if(rs != null )rs.close(); }catch(Exception e) {}
			
		}
		
		
	}
	
}
