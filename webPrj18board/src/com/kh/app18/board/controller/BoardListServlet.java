package com.kh.app18.board.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app18.board.vo.BoardVo;

@WebServlet(urlPatterns = "/board/list")
public class BoardListServlet extends HttpServlet{
	
	
	// 게시글 목록 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		
		//데이터 뭉치기
		// (여기선 꺼내고 뭉칠 것이 없음! )
		
		// 디비 다녀오기
		/*
		 * 커넥션 준비 (라이브러리, 클래스 등록, 드라이버, url, username, password)
		 * sql(준비, 완성, 실행 및 결과 저장)
		 * 트랜젝션 처리, 자원반납
		 */
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "C##SEMI";
		String password = "SEMI";		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVo> voList = new ArrayList<BoardVo>();
		
		try {
			Class.forName(driver);
			// 가져온 connection을 변수 conn에 담기.
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			
			//작성
			String sql = "SELECT TITLE, CONTENT FROM BOARD";
			//준비
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//rs -> data -> vo
			// 커서 계속 내리면서 가져옴 :: while
			while(rs.next()) {
				//rs에 있는 걸 변수에 담아줌
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				
				// 여러 개의 객체 담을 수 있는  ArrayList 사용 :: vo로 뭉치기
				BoardVo vo = new BoardVo();
				vo.setTitle(title);
				vo.setContent(content);
				
				//voList에 vo를 담아줌
				voList.add(vo);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn !=null && !conn.isClosed())conn.close();} catch (SQLException e) {}
			try {if(pstmt !=null && !pstmt.isClosed())pstmt.close();} catch (SQLException e) {}
			try {if(rs !=null && !rs.isClosed())rs.close();} catch (SQLException e) {}
		}
		
		// 화면선택
		// 리퀘스트는 일회용 :: 현재 요청에서만 유용
		req.setAttribute("voList", voList);
		// 여기서는 forward로 처리를 해 주어야 함!
		req.getRequestDispatcher("/views/board/list.jsp").forward(req, resp);
	}
	

}
