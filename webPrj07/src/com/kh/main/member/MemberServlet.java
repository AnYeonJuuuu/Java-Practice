package com.kh.main.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/login")
public class MemberServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		
		//응답
		resp.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = resp.getWriter();
		
		// 비지니스 로직
		
		// memberPwd.equals("1234")를 -> "1234".equals(memberPwd)으로 바꿈 :: 오류 방지 위해?
		if(memberId.equals("admin") && "1234".equals(memberPwd)) {
			//로그인 성공
			out.write("<!DOCTYPE html>\r\n"
					+ "<html lang=\"ko\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>로그인결과</title>\r\n"
					+ "    <style>\r\n"
					+ "        h1{\r\n"
					+ "            background-color: blue;\r\n"
					+ "        }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <h1>로그인 성공</h1>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}else {
			//로그인 실패
			out.write("<!DOCTYPE html>\r\n"
					+ "<html lang=\"ko\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>로그인결과</title>\r\n"
					+ "    <style>\r\n"
					+ "        h1{\r\n"
					+ "            background-color: red;\r\n"
					+ "        }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <h1>로그인 실패</h1>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
	
	}
}
