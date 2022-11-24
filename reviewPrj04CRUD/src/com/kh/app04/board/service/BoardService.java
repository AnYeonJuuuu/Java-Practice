package com.kh.app04.board.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kh.app04.board.dao.BoardDao;
import com.kh.app04.board.vo.BoardVo;

import static com.kh.app04.common.JDBCTemplate.*;

public class BoardService {
	
	//private final BoardDao dao = new BoardDao();
	private final BoardDao dao;
	
	// 생성자를 만들어서 할당? 이런 형태로 dao를 사용할 예정임!
	public BoardService() {
		dao = new BoardDao();
	}
	
	//게시글 작성하기(insert)
	public int insertBoard(BoardVo vo) {
		
		//Connection 준비(ip, port, url, username, pwd)
		Connection conn = getConnection();
		
		//디비 다녀오기
		/* BoardDao dao = new BoardDao(); */
		int result = dao.insertBoard(conn, vo);
		
		//커밋 || 롤백
		if(result == 1) {
			commit(conn);
		}
		//바뀐게 없으니 롤백 안 써줘도 됨!
		
		//자원반납
		close(conn);
		
		return result;
		
	}
	
	
}
