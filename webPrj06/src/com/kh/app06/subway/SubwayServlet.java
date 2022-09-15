package com.kh.app06.subway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿의 최상단 경로에 /app06 이 있으므로 url에 쓰지 않아야 함!!
@WebServlet(urlPatterns = "/subway")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//데이터 꺼내기
		String age_ = req.getParameter("age");
		int age = Integer.parseInt(age_);
		
		int price = 0;
		if(age < 10) {
			price = 500;
		}else if(age < 20){
			price = 1250;
		}else {
			price = 1500;
		}
		
		//응답하기
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>" + price + "won </h1>");
		
	}
}
