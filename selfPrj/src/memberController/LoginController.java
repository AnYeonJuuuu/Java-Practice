package memberController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import memberVo.MemberVo;
@WebServlet(urlPatterns = "/member/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		MemberVo vo = new MemberVo();
		vo.setUserId(userId);
		vo.setUserPwd(userPwd);
		
		MemberVo loginMember = new MemberService().login(vo);
		List<MemberVo> joinList = new MemberService().joinList();
		
		if(loginMember != null) {
			System.out.println("로그인 성공");
			HttpSession s = req.getSession();
			s.setAttribute("loginMember", loginMember);
		}else {
			req.setAttribute("msg", "로그인 실패");
			req.getRequestDispatcher("/common/error.jsp").forward(req, resp);
		}
		
	}
}
