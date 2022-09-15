package com.kh.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/my")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라가 보낸 데이터 꺼내기
		String x = req.getParameter("userNick");
		String y = req.getParameter("userPwd");
		System.out.println(x);
		System.out.println(y);

		
		
		// 응답 내용 설정(아래 두 줄 위 한 줄로 사용 가능!)
		resp.setContentType("text/html; charset=UTF-8;");
//		resp.setContentType("text/plain"); // MIME TYPE = 내가 어떤 타입을 응답하는건지 알려주는 타입
//		resp.setCharacterEncoding("UTF-8");
		
		// 응답 진행
		PrintWriter w = resp.getWriter();
		w.write("<!DOCTYPE html>");
		w.write("<html>");
		w.write("<head>");
		w.write("<style>");
		w.write("h1{color:red;}");
		w.write("</style>");
		w.write("</head>");
		w.write("<body>");
		w.write("<h1>");
		w.write(x);
		w.write("님 환영합니다~</h1>");
		w.write("</body>");
		w.write("</html>");

	}
	
}













