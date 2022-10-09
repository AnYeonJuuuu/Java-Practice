package com.kh.semi.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.semi.notice.service.NoticeService;
import com.kh.semi.notice.vo.NoticeVo;
@WebServlet(urlPatterns = "/notice/detail")
public class NoticeDetailController extends HttpServlet{
	
	//게시글 상세 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		String no = req.getParameter("no");
		
		
		//뭉치기
		
		//다녀오기(넘버를 전달하면서 조회)
		NoticeVo vo = new NoticeService().selectNoticeOne(no);
		
		//화면선택(데이터 담아서 -> 포워딩) 리퀘스트에 담겨있는지(포워딩) 없는지(리다이렉트)
		req.setAttribute("vo", vo);
		req.getRequestDispatcher("/views/notice/detail.jsp").forward(req, resp);
	}
}
