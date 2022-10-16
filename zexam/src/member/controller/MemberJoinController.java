package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberService;
import member.vo.MemberVo;



@WebServlet(urlPatterns = "/member/join")
public class MemberJoinController extends HttpServlet{
	
	//회원가입 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/member/join.jsp").forward(req, resp);
	}
	
	//회원가입
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 인코딩
		req.setCharacterEncoding("UTF-8");
		
		//데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd1");
		String memberName = req.getParameter("memberName");
		String eMail = req.getParameter("eMail");
		String phone = req.getParameter("phone");
		String grade = req.getParameter("grade");

		
		// 뭉치기
		MemberVo vo = new MemberVo();
		vo.setId(memberId);
		vo.setPwd(memberPwd);
		vo.setName(memberName);
		vo.seteMail(eMail);
		vo.setPhone(phone);
		vo.setGrade(grade);
		
		// 디비 다녀오기
		int result = new MemberService().join(vo);
		
		// 화면선택
		if(result == 1) {
			//성공
			req.getSession().setAttribute("alertMsg", "회원가입 성공~");
			resp.sendRedirect("/exam");
		}else {
			//실패
			System.out.println("회원가입 실패");
		}
		
	}
}
