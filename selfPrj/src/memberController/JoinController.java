package memberController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memberVo.MemberVo;
@WebServlet(urlPatterns = "/member/join")
public class JoinController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/member/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId =  req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		MemberVo vo = new MemberVo();
		vo.setUserId(userId);
		vo.setUserPwd(userPwd);
		
		int result = new MemberService().join(vo);
		
		if(result == 1) {
			req.getSession().setAttribute("alertMsg", "회원가입 성공!");
			resp.sendRedirect("/selfapp");
		}else {
			System.out.println("회원가입 실패!!");
		}
		
 		
	}


	
}
