package com.kh.semi.notice.service;

import java.sql.Connection;
import java.util.List;

// 이렇게 수정하면 jdbcTemplate. 안쓰고도 사용 가능
import static com.kh.semi.common.JDBCTemplate.*;

import com.kh.semi.notice.dao.NoticeDao;
import com.kh.semi.notice.vo.NoticeVo;

public class NoticeService {
	
	// 다시 할당할 필요 없으므로 final 붙임
	private final NoticeDao dao = new NoticeDao();

	//공지 작성
	public int write(NoticeVo vo) {
		//커넥션 준비
		//sq;
		//트랜젝션 자원반납
		
		Connection conn = getConnection();
		
		int result = dao.insertNotice(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	// 공지사항 목록 조회
	public List<NoticeVo> selectNoticeList() {
		// 커넥션 준비
		// sql
		// 트랜젝션 처리, 자원
		
		Connection conn = getConnection();
		
		List<NoticeVo> voList = dao.selectNoticeList(conn);
		
		close(conn);
		
		return voList;
	}

	//상세조회
	public NoticeVo selectNoticeOne(String no) {
		//커넥션 준비
		//sql (조회수 증가, 상세조회 두 가지를 해야함!) 
		//트랜젝션, 자원반납
		
		Connection conn =  getConnection();
		NoticeVo vo = null;
		
		//조회수 증가
		int result = dao.increaseHit(conn, no);
		if(result == 1 ) {
			commit(conn);
			//상세 조회
			vo = dao.selectNoticeOne(conn, no);
		}
		
		
		close(conn);
		
		return vo;
	}

	public int edit(NoticeVo vo) {
		//커넥션 준비
		
		//sql
		
		//트랜젝션 자원반납
		Connection conn  = getConnection();
		//게시글 하나를 번호로 업뎃한다는 의미
		int result = dao.updateOneByNo(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}
	// 공지사항 삭제
	public int delete(String no) {
		//커넥션준비
		//sql
		//트랜젝션 처리, 자원반납
		Connection conn =  getConnection();
		int result = dao.delete(conn, no);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	
		return result;
	}

}
