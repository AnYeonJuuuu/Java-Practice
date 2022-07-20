package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.JDBCTemplate;

public class MemberController {

	/*
	 * 회원가입 아이디, 패스워드, 닉네임 전달 받고 db에 insert
	 * 
	 * 아이디, 닉네임 검사(중복, 글자수, 특수문자)
	 * 
	 * insert 성공? 성공했다고 알려주기 : 실패 했다고 알려주기
	 */
	public int join() {

		MemberDto dto = showJoinView();

		// 커넥션 필요함
		Connection conn = JDBCTemplate.getConnection();

		// 커넥션 이용해서 sql 실행
		String sql = "INSERT INTO MEMBER(ID, PWD, NICK, ENROLL_DATE, QUIT_YN) VALUES(?,?,?,SYSDATE,'N')";

		int result = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getNick());
//			pstmt.setString(4, "SYSDATE"); // SYSDATE와 'N'값은 위에서 처리
//			pstmt.setString(5, "N");

			result = pstmt.executeUpdate();// executeQuery는 리턴타입이 ResultSet
			// 실행결과가 숫자로 나오는 sql(=DML UPDATE INSERT DELETE) 이용할 때 = executeUpdate 이용하면 됨!!

		} catch (SQLException e) {
			System.out.println("회원가입 중 예외 발생 ! ");
			e.printStackTrace();
		}

		return result;

	}

	private MemberDto showJoinView() {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.println("닉네임 : ");
		String nick = sc.nextLine();

		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setNick(nick);

		return dto;

	}

	/*
	 * 아이디 패스워드 받아서 회원 닉네임 조회 닉네임 님 안녕하세요 출력
	 */
	
	public void login(String id, String pwd) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		
		try {

			// 커넥션 필요함
			conn = JDBCTemplate.getConnection();

			// 커넥션 이용해서 sql 실행
			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				MemberDto md = new MemberDto();
				md.setId(rs.getString("ID"));
				md.setPwd(rs.getString("PWD"));
				md.setNick(rs.getString("NICK"));
				
				System.out.println(" ");
				System.out.println("* " + md.getNick() + "님 안녕하세요.");
			
		
			}

		} catch (Exception e) {
			System.out.println("로그인 중 예외 발생 ! ");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
		}



	}
	/* <마이페이지>
	 * 0. 로그인 여부 체크 -> 로그인 상태일 때만 아래 항목들 적용되도록!
	 * 1. 현재 회원 정보 보여주기
	 * 2. 변경할건지 물어보기 (1. 닉네임 변경 2. 비밀번호 변경)
	 * 3. 변경할 데이터 입력받기
	 * 4. sql 실행
	 * 5. 실행 결과에 따라, 서비스 로직 실행 (회원정보 수정이 완료되었습니다. -> 메인페이지 보여주기 or 마이페이지로 보내기 ...)
	 */
	public void edit() {

		
		
	}

}// class
