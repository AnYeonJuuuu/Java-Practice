package com.kh.app08;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test" )
public class TestServlet extends HttpServlet {
	
	// 화면 보여주기 :: 서블릿 가지고 out.write() 하는게 번거로움
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 자바코드 작업
		System.out.println("서블릿 동작 !!");
		
		//화면 작업
		resp.getWriter().write("<h1>today menu</h1>");
		
		
	}
}
