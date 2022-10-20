package com.kh.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/data")
public class DataController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String msg = req.getParameter("msg");
		String msg2 = req.getParameter("msg2");
		
		System.out.println("클라한테 받은 msg : "  + msg);
		System.out.println("클라한테 받은 msg2 : "  + msg2);
		
		PrintWriter out = resp.getWriter();
		out.write("Hello World");
		
	}
}
