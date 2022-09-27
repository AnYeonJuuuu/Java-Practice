package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.common.JDBCTemplate;

public class BoardDao {
	
	//sql부분을 dao로!
	public int insertBoard(Connection conn, BoardVo vo) {
		String sql = "INSERT INTO BOARD(TITLE, CONTENT) VALUES(?,?)";
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public List<BoardVo> selectBoardList(Connection conn) {
		
		String sql = "SELECT TITLE, CONTENT FROM BOARD";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVo> list = new ArrayList<BoardVo>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//rs -> data -> vo
			while(rs.next()) {
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			
			BoardVo vo = new BoardVo();
			vo.setTitle(title);
			vo.setContent(content);
			
			// 와일문 돌면서 vo를 리스트에 추가
			list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//여기서 만든건 여기서 close
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		

		
		return list;
	}
}
