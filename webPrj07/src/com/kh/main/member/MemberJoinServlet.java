package com.kh.main.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{
	

	
	@Override
	//보여주기용 회원가입 doGet
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 인코딩은 위에 쓰기! (순서 중요 : 인코딩 후 작업해야 잘 설정 됨!)
		resp.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = resp.getWriter();
		// join내용 싹 다 " " 안에 붙여넣기!
		out.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "		<h1>회원가입</h1>\r\n"
				// action 비워두면 현재문서로 감? ("\"에서 \는 빈칸을 나타냄.)
				+ "	<form action=\"\" method=\"post\">\r\n"
				+ "		아이디 : <input type=\"text\" name=\"memberId\">\r\n"
				+ "		<br>\r\n"
				+ "		비밀번호 : <input type=\"password\" name=\"memberPwd\">\r\n"
				+ "		<br>\r\n"
				+ "		닉네임 : <input type=\"text\" name=\"memberNick\">\r\n"
				+ "		<br>\r\n"
				+ "		<input type=\"submit\" value=\"회원가입\">\r\n"
				+ "	</form>	\r\n"
				+ "</body>\r\n"
				+ "</html>");
	
	}//doGet
	
	//실제로 회원가입 : doPost
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberNick = req.getParameter("memberNick");
		//비즈니스 로직
		int result = 1; // 실제로는 db에 인서트 한 결과
		
		//결과에 따라, 응답
		if(result == 1) {
			// 가입 성공
			CreateJoinResultView(resp);
		}else {
			// 가입 실패
			System.out.println("실패...");
		}
	}// doPost
	
	//화면 보여주는 메소드(따로 만들기)
	private void CreateJoinResultView(HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html; charset=UTF-8;");
		// 예외처리 왜 떴을까? doPost 안에서는 이미 throw 처리 돼있기 때문
		PrintWriter out = resp.getWriter();
		out.write("<!DOCTYPE html>\r\n"
				+ "<html lang=\"ko\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>회원가입결과</title>\r\n"
				+ "    <style>\r\n"
				+ "        h1{\r\n"
				+ "            background-color: blue;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>회원가입 성공</h1>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
	
	
	
	
	
	
	
}
