package com.kh.main.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/login")
public class MemberLoginServlet extends HttpServlet{

	// 로그인 화면 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/member/loginView.jsp").forward(req, resp);
	}
	
	// 실제 로그인 : doPost = 데이터를 가지고 처리하는 작업을 주로 함
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		
		// 디비에 가서 조회(select)
		if("admin".equalsIgnoreCase(memberId)&& "1234".equals(memberPwd)) {
			//성공
			//순서 주의! 다음타자로 넘기면 데이터 안 들어가므로 모든 것 처리하고 데이터 넘기기!
			req.setAttribute("nick", "관리자");
//			req.getRequestDispatcher("/").forward(req, resp); // 포워딩 방식
			resp.sendRedirect("/app15/index.jsp"); // 리다이렉트 방식 : 처리하는게 "클라이언트"이므로 경로 제대로 써줘야함!!
			
		}else {
			
			req.getRequestDispatcher("/loginFail.jsp").forward(req, resp);
		}
		boolean isLogin = true;
		
//		if(isLogin) {
//			//성공 시, 메인페이지로
//		}else {
//			//실패
//		}
//		
		
	
	}
}
