package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;
@WebServlet("/board/write")
public class BoardWriteController extends HttpServlet{
	
	//게시글 작성(화면)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//절대경로 :: / 있음 (최상단 경로부터)
		//상대경로 : / 없음(현재 경로부터)
 		req.getRequestDispatcher("/WEB-INF/views/board/write.jsp").forward(req, resp);
	}
	
	//게시글 작성(실제)
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
		
		//디비 다녀오기
		BoardService bs = new BoardService();
		int result = bs.write(vo);
		
		//화면
		if(result == 1) {
			resp.getWriter().write("success");
		}else {
			resp.getWriter().write("fail");
		}
	}
}
