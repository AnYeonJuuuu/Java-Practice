package com.kh.app17.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/member/login")
public class MemberLoginServlet extends HttpServlet{

	//로그인 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/member/login.jsp").forward(req, resp);
			
	}
	
	//로그인
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		
		// 데이터 뭉치기
		MemberVo vo = new MemberVo();
		vo.setMemberId(memberId);
		vo.setMemberPwd(memberPwd);
		
		// db갔다오기( == 비즈니스 로직 == 서비스로직)
		/*
		 * 커넥션 준비
		 * - 라이브러리 등록
		 * - 드라이버, url, username, password
		 * - 클래스 등록
		 * - 커넥션 얻기
		 * - 오토커밋 설정
		 * sql 준비
		 * sql 완성
		 * sql 실행 및 결과 저장
		 * 트랜젝션 (커밋 롤백)
		 * 자원반납 (클로즈)
		*/
		
		//커넥션 준비
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##SEMI";
		String password = "SEMI";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo loginMember = null;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			
			String sql = "SELECT MEMBER_ID ,MEMBER_PWD ,MEMBER_NICK FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PWD = ?";
			conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);
			
			//sql 완성
			pstmt.setString(1, vo.getMemberId());
			pstmt.setString(2, vo.getMemberPwd());
			
			//sql 실행 및 결과저장
			rs = pstmt.executeQuery();
			
			//rs - obj
			/*
			 * 커서를 다음 칸으로 내려주기
			 * 해당 커서가 가리키는 곳에서 데이터 하나하나 읽어오기
			 */
			if(rs.next()) {
				String dbMemberId = rs.getString("MEMBER_ID");
				String dbMemberPwd = rs.getString("MEMBER_PWD");
				String dbMemberNick = rs.getString("MEMBER_NICK");
				
				loginMember = new MemberVo();
				loginMember.setMemberId(dbMemberId);
				loginMember.setMemberPwd(dbMemberPwd);
				loginMember.setMemberNick(dbMemberNick);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {if(rs != null && rs.isClosed()) {rs.close();}}catch(Exception e){}
			try {if(pstmt != null && pstmt.isClosed()) {pstmt.close();}}catch(Exception e){}
			try {if(conn != null && conn.isClosed()) {conn.close();}}catch(Exception e){}
		}
		
		// 화면 선택
		if(loginMember != null) {
			//로그인 성공
			//저장소 
//			req.setAttribute("data", loginMember); :: 재사용 불가! 일회용
			HttpSession s = req.getSession();
			s.setAttribute("data", loginMember);
			resp.sendRedirect("/app17");
		}else {
			// 실패
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}

	}
}
