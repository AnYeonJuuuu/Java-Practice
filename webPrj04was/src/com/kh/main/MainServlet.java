package com.kh.main;

import java.io.IOException;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//여기 있는 클래스는 webPrj04was에 존재하는 것!

@WebServlet(urlPatterns = "/main") // 어노테이션? 달아주기 127.0.0.1:8888/app04/main 이지만 127.0.0.1:8888/app04 는 고정값이므로 안 써도 됨!
public class MainServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("내가 만든 자바 메소드 실행@@");
	}
}
