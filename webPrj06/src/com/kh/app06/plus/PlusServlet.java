package com.kh.app06.plus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/plus")
public class PlusServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 값 꺼내기
		String a = req.getParameter("n1");
		String b = req.getParameter("n2");
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		System.out.println(aa+bb);
		
		//응답
		PrintWriter out = resp.getWriter();
		out.write("<h1>Plus Result = " + (aa+bb) +"</h1>");
		
	}
	
}
