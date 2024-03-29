package com.kh.app.board.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.boardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.common.db.JDBCTemplate;

public class BoardService {

	//게시글 작성
	public int write(BoardVo vo) {
		//디비연결
		SqlSession ss =  JDBCTemplate.getSqlSession();
		//다른 메소드
		
		//sql실행
		boardDao dao = new boardDao();
		int result = dao.write(ss, vo);
		
		//트랜젝션 자원반납
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		ss.close();
		
		//결과리턴
		return result;
	}

	//게시글 목록 조회
	public List<BoardVo> selectBoardList(Map<String, String> map) {

		//디비 연결
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//sql 실행
		boardDao dao = new boardDao();
		List<BoardVo> list = dao.selectBoardList(ss,map);
		
		//트랜젝션 자원반납
		ss.close();
		
		//결과리턴
		return list;
	}

	//게시글 갯수 조회
	public int selectCount() {
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		boardDao dao = new boardDao();
		int cnt = dao.selectCount(ss);
		
		ss.close();
		
		return cnt;
	}

}
