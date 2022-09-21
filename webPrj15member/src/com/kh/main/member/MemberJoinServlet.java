package com.kh.main.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// urlPatterns = "/member/join" = 가상의 주소에 요청 걸어줌
// doGet/ doPost 방식으로 url하나로 두 가지 방식 모두 처리 가능해짐!!!
@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{
	
	// get 방식 == 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/member/joinView.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberNick = req.getParameter("memberNick");
		
		//디비에 저장
		int result = 1;
		
		//데이터 출력
		System.out.println(memberId);
		System.out.println(memberPwd);
		System.out.println(memberNick);
		
		// 결과화면 보여주기
		if(result == 1) {
			//성공 : /member/joinOkResult.jsp -> 맨 앞 / 가 /app15 를 의미!
			req.getRequestDispatcher("/member/joinOkResult.jsp").forward(req, resp);
		}else{
			//실패
			req.getRequestDispatcher("/member/joinFailResult.jsp").forward(req, resp);
		}
		
	}
}
