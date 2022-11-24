package com.kh.app04.board.dao;

import static com.kh.app04.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kh.app04.board.vo.BoardVo;

public class BoardDao {
	//게시글 작성하기
	public int insertBoard(Connection conn, BoardVo vo) {
		//sql준비
		String sql = "INSERT INTO BOARD(TITLE, CONTENT) VALUES(?,?)";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			//sql완성
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			
			//sql실행
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			
		}
		
		return result;
		
	}
}
