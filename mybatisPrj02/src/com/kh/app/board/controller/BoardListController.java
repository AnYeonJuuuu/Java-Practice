package com.kh.app.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.directory.SearchControls;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.board.vo.SearchVo;
@WebServlet("/board/list")
public class BoardListController extends HttpServlet{
	//목록조회는 doGet, doPost상관 없으므로 -> service로 처리
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//검색기능 -> 데이터 꺼내기 뭉치기 필요해짐
		//데이터 꺼내기
		String category = req.getParameter("category");
		String keyword = req.getParameter("keyword");
		
		//뭉치기(vo || map)
		//일회성으로 사용 되는 경우 : 맵에 키 밸류 형태로 써도 됨!
//		SearchVo vo = new SearchVo();
//		vo.setCategory(category);
//		vo.setKeyword(keyword);
		Map<String, String> map = new HashMap<>();
		map.put("keyword", keyword);
		map.put("category", category);
		
		//디비 다녀오기
		BoardService bs =  new BoardService();
		List<BoardVo> voList = bs.searchBoardList(map);
	
		
		//문자열 내보내기(디비에서 얻은 결과를 이용해서)
		req.setAttribute("voList", voList);
		req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
		
		
	}
}




