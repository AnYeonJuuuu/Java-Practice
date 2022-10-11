package com.kh.semi.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.kh.semi.member.service.MemberService;
import com.kh.semi.member.vo.MemberVo;
@WebServlet(urlPatterns = "/member/mypage")
public class MemberMypageController extends HttpServlet{
	//마이페이지 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//화면
//		resp.sendRedirect("/semi/views/member/mypage.jsp");
		//로그인 되어 있을 때만 포워딩 되도록!
		HttpSession s = req.getSession();
		MemberVo loginMember = (MemberVo)s.getAttribute("loginMember");
		if(loginMember != null) {
			// 그냥 화면 보여주는 것이므로 포워딩 이용했음!
			// 브라우저 주소창에 주소 그대로 나오는게 아니였으면 해서!
			req.getRequestDispatcher("/views/member/mypage.jsp").forward(req, resp);
		}else {
			//에러페이지
			req.setAttribute("msg", "로그인 후 이용해주세요.");
			req.getRequestDispatcher("/views/common/errorPage.jsp");
			
		}
		
	}
	
	//마이페이지 (정보수정)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 인코딩
		req.setCharacterEncoding("UTF-8");
		// 세션 준비
		HttpSession session = req.getSession();
		
		// 데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd1 = req.getParameter("memberPwd1");
		String memberNick = req.getParameter("memberNick");
		String addr =  req.getParameter("addr");
		String[] hobby =  req.getParameterValues("hobby");
		
		// 로그인멤버는 세션에서 꺼내왔음!
		MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
		String no = loginMember.getNo();
		
		// 데이터 뭉치기
		MemberVo vo = new MemberVo();
		vo.setId(memberId);
		vo.setPwd(memberPwd1);
		vo.setNick(memberNick);
		vo.setAddr(addr);
		vo.setHobby(String.join(",", hobby));
		//세션에 들어있는 loginMember 객체의 no 값을 채워줌
		vo.setNo(no);
		
		// 디비 다녀오기
		// update와 select가 같이 이루어져야 하므로 updateMember 타입을 MemberVo로 설정!
		MemberVo updatedMember = new MemberService().edit(vo);
	
		//화면선택
		if(updatedMember != null) {
			//ok
			req.getSession().setAttribute("alertMsg", "회원 정보 수정 성공!");
			req.getSession().setAttribute("loginMember", updatedMember);
			resp.sendRedirect("/semi");
			}else {
				//ㄴㄴ
				req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
			}
			
		}
	}
	
	

