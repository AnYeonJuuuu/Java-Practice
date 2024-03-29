package com.kh.semi.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.semi.board.service.BoardService;
import com.kh.semi.board.vo.BoardVo;
import com.kh.semi.board.vo.CategoryVo;
import com.kh.semi.member.vo.MemberVo;
@WebServlet(urlPatterns = "/board/write")
public class BoardWriteController extends HttpServlet{

	private final BoardService bs = new BoardService();
	
	// 게시글 작성 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//꺼내기
		
		//뭉치기
		
		//다녀오기
		List<CategoryVo> cateList =  bs.selectCategoryList();
		
		// req or session => 어떤 방법 이용 둘 다 괜찮지만 req이용!
		req.setAttribute("cateList", cateList);
		
		//화면선택
		req.getRequestDispatcher("/views/board/write.jsp").forward(req, resp);
	}
	
	//게시글 작성하기
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//세션 가져오기
		HttpSession s= req.getSession();
		
		//로그인 멤버 가져오기
		MemberVo loginMember = (MemberVo)s.getAttribute("loginMember");
		
		//인코딩 처리
		req.setCharacterEncoding("UTF-8");
		
		//꺼내기
		String category = req.getParameter("category");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		//뭉치기
		BoardVo vo = new BoardVo();
		vo.setCategory(category);
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(loginMember.getNo());
		
		//디비 다녀오기
		int result = bs.write(vo);
		
		//화면선택
		if(result == 1) {
			//성공 => 알람,목록으로
			s.setAttribute("alertMsg", "게시글 작성 성공!");
			//새로고침 시 또 다시 게시글 작성 되는것을 막고자!
			resp.sendRedirect("/semi/board/list");
		}else {
			//실패 => 메세지, 에러페이지
			req.setAttribute("msg", "게시글 작성 실패");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
	
	}
	
}
