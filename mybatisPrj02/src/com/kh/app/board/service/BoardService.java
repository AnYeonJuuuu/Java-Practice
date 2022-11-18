package com.kh.app.board.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.board.vo.SearchVo;
import com.kh.app.common.db.JDBCTemplate;

public class BoardService {

	//게시글 작성하기 (찐)
	public int write(BoardVo vo) {
		
		//커넥션 준비(conn -> sqlSession)
		
		//sql실행
		
		//자원반납

		//결과리턴
		
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		BoardDao dao =  new BoardDao();
		int result = dao.write(ss, vo);
		
		if(result ==1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		ss.close();
		
		return result;
		
	}

	//게시글 목록 조회
	public List<BoardVo> selectBoardList() {
		
		//디비 연결 준비
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//sql 실행
		BoardDao dao = new BoardDao();
		List<BoardVo> voList =  dao.selectBoardList(ss);
		
		//트랜젝션 || 자원반납
		ss.close();
		
		//결과리턴
		return voList;
		
	}

	//게시글 검색 목록 조회
	public List<BoardVo> searchBoardList(Map<String, String> map) {

		SqlSession ss = JDBCTemplate.getSqlSession();
		
		BoardDao dao =  new BoardDao();
		List<BoardVo> voList = dao.searchBoardList(ss,map);
		
		ss.close();
		
		return voList;
		
	}
	
}//class
