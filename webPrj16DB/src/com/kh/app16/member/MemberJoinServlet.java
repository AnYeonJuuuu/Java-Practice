package com.kh.app16.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{
	
	//회원가입 (화면)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/member/join.jsp").forward(req, resp);
	}
	
	//회원가입
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// 데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberNick = req.getParameter("memberNick");
		
		// 데이터 뭉치기(변수 -> 객체)
		MemberVo vo = new MemberVo();
		vo.setMemberId(memberId);
		vo.setMemberPwd(memberPwd);
		vo.setMemberNick(memberNick);
		
		// 디비 다녀오기
		/*
		 * 커넥션 준비 (라이브러리 준비, 클래스 등록, 커넥션 얻기-driver, url, username, userpwd )
		 * SQL 준비
		 * SQL 완성
		 * SQL 실행 및 결과 저장
		 */
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		// 클래스 등록
		try {
			
			//커넥션 준비
			//오버라이드 된 것이므로 예외던지기가 안됨(try-catch로 잡아야!)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "C##SEMI";
			String password = "SEMI";
			conn = DriverManager.getConnection(url, username, password);
			
			//SQL 준비
			String sql = "INSERT INTO MEMBER ( MEMBER_ID , MEMBER_PWD , MEMBER_NICK ) VALUES ( ?, ?, ? )";
			pstmt = conn.prepareStatement(sql);
			
			//SQL 완성
			pstmt.setString(1, vo.getMemberId());
			pstmt.setString(2, vo.getMemberPwd());
			pstmt.setString(3, vo.getMemberNick());
			
			//SQL 실행 및 결과 저장
			result = pstmt.executeUpdate();
			
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {if(conn != null && !conn.isClosed()) conn.rollback();} catch (SQLException e1) {}
		}finally {
			try {if(pstmt != null && !pstmt.isClosed())pstmt.close();} catch (SQLException e) {}
			try {if(conn != null && !conn.isClosed())conn.close();} catch (SQLException e) {}
		}

		// 화면선택
		if(result == 1) {
			// 성공 -> 로그인 페이지로 보내기
//			req.getRequestDispatcher("").forward(req, resp); <- 새로고침 시 계속 회원가입 됨
			resp.sendRedirect("/app16/member/login");
			
		}else{
			// 실패
			resp.sendRedirect("/app16/erorr");
		}
		
	}
}
















