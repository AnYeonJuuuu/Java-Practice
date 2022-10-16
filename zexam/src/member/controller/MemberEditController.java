package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberService;
import member.vo.MemberVo;



@WebServlet(urlPatterns = "/member/edit")
public class MemberEditController extends HttpServlet{

		// 공지사항 수정하기 (회면)
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			//꺼내기
			String no = req.getParameter("no");
			//뭉치기
			
			//다녀오기
			MemberVo vo = new MemberService().selectMemberOne(no);
			
			//화면선택
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/views/member/edit.jsp").forward(req, resp);
		}
		
		//수정하기
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			//인코딩
			req.setCharacterEncoding("UTF-8");
			
			// 데이터 꺼내기
			String memberId = req.getParameter("memberId");
			String memberPwd = req.getParameter("memberPwd1");
			String memberName = req.getParameter("memberName");
			String eMail = req.getParameter("eMail");
			String phone = req.getParameter("phone");
			String grade = req.getParameter("grade");
			//넘버로 조회할것임?
			String no = req.getParameter("no");
			
			// 뭉치기
			MemberVo vo = new MemberVo();
			vo.setId(memberId);
			vo.setPwd(memberPwd);
			vo.setName(memberName);
			vo.seteMail(eMail);
			vo.setPhone(phone);
			vo.setGrade(grade);
			
			// 디비 다녀오기
			int result = new MemberService().edit(vo);
			
			// 화면 선택
			if(result == 1) {
				//성공 => 공지사항 상세조회 //성공 알람 
				//alertMsg 는 세션에 담아줬었음!! header.jsp에서!
				req.getSession().setAttribute("alertMsg", "공지사항 수정 성공!");
				//클라가 보내는 요청이므로? /semi 붙여야함
				resp.sendRedirect("/exam");
			}else {
				//실패
				//req에 메세지 담았으므로 살리기 위해 -> 포워딩 
				req.setAttribute("msg", "공지사항 수정 실패");
				req.getRequestDispatcher("/views/common/errerPage.jsp").forward(req, resp);
				
			}
			
		}
}
