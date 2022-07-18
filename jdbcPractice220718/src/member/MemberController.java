package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
		PreparedStatement pstmt = null;
		
		// 커넥션 이용해서 sql 실행
		String sql = "INSERT INTO MEMBER(ID, PWD, NICK, ENROLL_DATE, QUIT_YN) VALUES(?,?,?,SYSDATE,'N')";

		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getNick());
//			pstmt.setString(4, "SYSDATE"); // SYSDATE와 'N'값은 위에서 처리
//			pstmt.setString(5, "N");

			result = pstmt.executeUpdate();// executeQuery는 리턴타입이 ResultSet
			// 실행결과가 숫자로 나오는 sql(=DML UPDATE INSERT DELETE) 이용할 때 = executeUpdate 이용하면 됨!!

			// 실행 결과에 따라서, 커밋 or 롤백
			if(result > 0) {
				if(conn != null)JDBCTemplate.commit(conn); //if(conn != null) 쓰는 이유 여러가지 상황에 대한 안전장치
			}else {
				JDBCTemplate.rollback(conn);
			}
			
		} catch (SQLException e) {
			JDBCTemplate.rollback(conn);
			System.out.println("회원가입 중 예외 발생 ! ");
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn); // 널체크와 클로즈 처리 한 번에 가능
			JDBCTemplate.close(pstmt); 
//			JDBCTemplate.close(rs); <- 회원가입에서는 insert만 했으므로 결과집합 없음.
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
	 * 아이디 패스워드 받기 
	 * 아이디, 패스워드 일치하는 행 찾기
	 * 
	 * 회원정보(아이디, 닉네임, 회원가입 일시) 가져오기
	 * 
	 * 회원정보 리턴
	 */

	public MemberDto login() {

		MemberDto result = showLoginView();
		// 미리 id pwd 변수 만들어서
		String id = result.getId();
		String pwd = result.getPwd();

		// 디비와 연결, 아이디 패스워드로 조회

		// 드라이버 등록
		// 드라이버 이용해서 연결 가져오기 // 커넥션 가져왔으면 클로즈 해줘야함
		Connection conn = JDBCTemplate.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 연결된 정보를 이용해서 sql 실행
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
		MemberDto loginMember = null;

		// 자바에서 db로 sql 날려줘야함
		
		try {
			pstmt = conn.prepareStatement(sql);
			//pstmt 이용해서 실행 : 1번째 물음표를 id라는 변수로 채워라
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			//지금 실행하는 쿼리는 ? SELECT쿼리 -> 결과집합(ResultSet)
			//쿼리 실행해서, "결과집합"을 얻어야 하므로 .executeQuery() 사용하기.
			rs = pstmt.executeQuery();
			
			// 커서를 한 줄 아래로 이동시키는 -> rs.next();
			// 닉네임 가져오기
			// """"if로도 가능하지만,""""
			if(rs.next()) {
				
				// 3개의 값 
				String nick = rs.getString("NICK"); // 원하는 칼럼을 가리키게!
				String memberId = rs.getString("ID");
				Timestamp enrollDate = rs.getTimestamp("ENROLL_DATE");
				
				loginMember = new MemberDto();
				loginMember.setId(memberId);
				loginMember.setNick(nick);
				loginMember.setEnroll_date(enrollDate);
			}
			
		} catch (SQLException e) {
			System.out.println("로그인 에러 !!! ");
			e.printStackTrace();
		} finally {// 무조건 자원 반납 해줘야 하므로
			JDBCTemplate.close(conn); // 널체크와 클로즈 처리 한 번에 가능
			JDBCTemplate.close(pstmt); 
			JDBCTemplate.close(rs); 
			
		}
		
		return loginMember;

	}
	

	// 공통되고 중복되는 로직은 메소드로 분리 (유지보수 쉽게 하기 위함)
	public MemberDto showLoginView() {

		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String pwd = sc.nextLine();

//		String[] strArr = {id,pwd};
		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPwd(pwd);

		return dto; 

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
	
	
	public void loginCheck(MemberDto dto) {
		if(dto != null) {
			System.out.println("===== 로그인 유저정보 =====");
			System.out.println(dto);
		}else {
			System.out.println("로그인 실패");
		}
	}//loginCheck

	

}// class
