package com.kh.app.board.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.common.JDBCTemplate;

public class BoardService {
	
	public int write(BoardVo vo) {
		/*
		 * 커넥션 준비(라이브러리, 클래스등록, 드라이버, url, username, password, 오토커밋)
		 * sql(준비 완성 실행 및 결과저장)
		 * 트랜젝션, 자원정리
		 */
		
		Connection conn =  JDBCTemplate.getConnection();

		//sql(준비, 완성, 실행 및 결과 저장) == Dao 레이어에서 처리
		BoardDao dao = new BoardDao();
		int result = dao.insertBoard(conn, vo);
		
		//트랜젝션 처리, 자원반납
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public List<BoardVo> selectBoardList() {
		
		//커넥션 준비
		Connection conn = JDBCTemplate.getConnection();
		
		//sql == 메소드 호출
		BoardDao dao = new BoardDao();
		List<BoardVo> list = dao.selectBoardList(conn);
		
		//트랜젝션, 자원반납 == select는 트랜젝션 처리 안해도 됨!
		JDBCTemplate.close(conn);
		
		return list;
	}
	
	
}
