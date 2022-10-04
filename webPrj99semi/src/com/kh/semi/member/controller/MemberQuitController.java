package com.kh.semi.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.semi.member.service.MemberService;
import com.kh.semi.member.vo.MemberVo;
@WebServlet(urlPatterns = "/member/quit")
public class MemberQuitController extends HttpServlet{
	// 회원탈퇴
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 세션 준비
		HttpSession s = req.getSession();
		
		// 데이터 꺼내기
		MemberVo loginMember = (MemberVo)s.getAttribute("loginMember");
		String no = loginMember.getNo();
		
		// 뭉치키
		
		// 디비 다녀ㅑ오기
		int result = new MemberService().quit(no);
		
		// 화면ㅇ선택
		if(result == 1) {
			//ok
			s.invalidate();
			resp.sendRedirect("/semi");
		}else {
			//ㄴㄴ
			req.setAttribute("msg", "회원 탈퇴 실패!");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
	}
}
