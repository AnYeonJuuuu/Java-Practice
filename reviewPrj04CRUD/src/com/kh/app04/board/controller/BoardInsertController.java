package com.kh.app04.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.http.HttpClient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.AudioFormat.Encoding;

import com.kh.app04.board.service.BoardService;
import com.kh.app04.board.vo.BoardVo;
import com.kh.app04.common.JDBCTemplate;
@WebServlet(urlPatterns = "/board/insert")
public class BoardInsertController extends HttpServlet{

	//게시글 작성 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//내보낼 문자열 타입 지정하기
		//resp 이용해서 응답을 할 것 :: html형식; UTF-8로!
		resp.setContentType("text/html; charset=UTF-8;");
		
		//(게시글 작성 화면을)문자열 내보내기 ==> servlet에서만 해결하려니까 힘듦! ==> JSP로 편하게!
		//JSP가 하도록 바톤터치
		req.getRequestDispatcher("/WEB-INF/views/boardInsertView.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//인코딩
		req.setCharacterEncoding("UTF-8");
		
		//데이터 꺼내기
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		//뭉치기
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		System.out.println(vo);
		
		BoardService service = new BoardService();
		service.insertBoard(vo);

		
		//화면선택(문자열 내보내기) :: servlet -> jsp가 하도록 만들기!
		req.getRequestDispatcher("/WEB-INF/views/boardListView.jsp").forward(req, resp);
	}
	
	
}
