package com.kh.semi.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.semi.board.vo.BoardVo;
import com.kh.semi.board.vo.CategoryVo;
import com.kh.semi.common.JDBCTemplate;

public class BoardDao {
	//카테고리 목록조회
	public List<CategoryVo> selectCategoryList(Connection conn) {

		String sql = "SELECT NO, NAME FROM CATEGORY ";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CategoryVo> list = new ArrayList<CategoryVo>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//rs -> var -> vo
			
			while(rs.next()) {
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				
				//만들 때 부터 파라미터로 no, name을 가지게 하면 조금 더 안정적인 코드가 됨!!
				CategoryVo vo = new CategoryVo(no, name);
//				vo.setNo(no);
//				vo.setName(name);
				
				list.add(vo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
	}

	//게시글 작성
	public int insertBoard(Connection conn, BoardVo vo) {
		//sql
		String sql = "INSERT INTO BOARD ( NO ,TYPE ,CATEGORY ,TITLE ,CONTENT ,WRITER ) VALUES ( SEQ_BOARD_NO.NEXTVAL , 1 , ? , ? , ? , ? )";
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCategory());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
	
		
		return result;
	}

}
