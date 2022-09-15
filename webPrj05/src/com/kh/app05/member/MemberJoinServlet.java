package com.kh.app05.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{
	
	// 회원가입
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		데이터 꺼내기
		String a = req.getParameter("memberId");
		String b = req.getParameter("memberPwd");
		String c = req.getParameter("memberNick");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 회원가입 완료 응답 :: PrintWriter 두 개를 이어주는 통로
		PrintWriter tw =resp.getWriter();
		tw.write("<h1>join success!!</h1>");
	}
	
}
