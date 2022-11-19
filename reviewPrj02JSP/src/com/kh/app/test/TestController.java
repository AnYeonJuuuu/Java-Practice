package com.kh.app.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = "/test")
public class TestController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hello !!!");
		
		int x = 10;
		
		// request에 담기 : 바톤에 memo : 10 이 저장 됨
		req.setAttribute("x", x);
		
		//session 에 담기
		HttpSession session = req.getSession();
		session.setAttribute("name", "ayj");
		
		
		//abc.jsp에 있는 문자열을 내보내기
		req.getRequestDispatcher("abc.jsp").forward(req, resp);
	}
}
