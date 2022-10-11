package com.kh.semi.notice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.kh.semi.common.JDBCTemplate.*;
import com.kh.semi.notice.vo.NoticeVo;

public class NoticeDao {

	public int insertNotice(Connection conn, NoticeVo vo) {
		//sql준비 완성 실행
		String sql = "INSERT INTO NOTICE ( NO ,TITLE ,CONTENT ,WRITER ) VALUES ( seq_notice_no.nextval , ? , ? , ? )";
	
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());

			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	// 공지사항 목록 조회
	public List<NoticeVo> selectNoticeList(Connection conn) {
		
		String sql = "SELECT * FROM NOTICE WHERE STATUS = 'O' ORDER BY NO DESC";
		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<NoticeVo> voList = new ArrayList<NoticeVo>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String no = rs.getString("NO");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String writer = rs.getString("WRITER");
				String hit = rs.getString("HIT");
				String enrollDate = rs.getString("ENROLL_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");
				
				// 와일문 돌면서 여러 개의 vo 객체들이 생길 것임!
				NoticeVo vo = new NoticeVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				vo.setHit(hit);
				vo.setEnrollDate(enrollDate);
				vo.setModifyDate(modifyDate);
				
				voList.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return voList;
		
	}

	//공지사항 상세조회
	public NoticeVo selectNoticeOne(Connection conn, String no) {
		//sql(준비, 완성, 실행 및 결과저장)
		String sql = "SELECT N.NO ,N.TITLE ,N.CONTENT ,N.HIT ,N.ENROLL_DATE ,N.MODIFY_DATE ,N.STATUS ,M.NICK AS WRITER FROM NOTICE N JOIN MEMBER M ON N.WRITER = M.NO WHERE N.NO = ? AND N.STATUS = 'O'";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		NoticeVo vo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// 현재 게시글 넘버 알고 있으므로 no는 안 가져옴
//				String no = rs.getString("NO");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String writer = rs.getString("WRITER");
				String hit = rs.getString("HIT");
				String enrollDate = rs.getString("ENROLL_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");
				
				vo = new NoticeVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				vo.setHit(hit);
				vo.setEnrollDate(enrollDate);
				vo.setModifyDate(modifyDate);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		return vo;
	}

	//조회수 증가시키는 쿼리문
	public int increaseHit(Connection conn, String no) {
		//sql
		String sql = "UPDATE NOTICE SET HIT = HIT + 1 WHERE NO = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}

	public int updateOneByNo(Connection conn, NoticeVo vo) {

		String sql = "UPDATE NOTICE SET TITLE = ?, CONTENT = ?, MODIFY_DATE = SYSDATE WHERE NO = ?";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}

	public int delete(Connection conn, String no) {
//		String sql = "DELETE NOTICE WHERE NO = ?";
		String sql = "UPDATE NOTICE SET STATUS = 'X' WHERE NO = ?";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}



}
