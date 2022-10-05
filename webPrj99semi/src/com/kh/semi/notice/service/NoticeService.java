package com.kh.semi.notice.service;

import java.sql.Connection;

import com.kh.semi.common.JDBCTemplate;
import com.kh.semi.notice.dao.NoticeDao;
import com.kh.semi.notice.vo.NoticeVo;

public class NoticeService {

	//공지 작성
	public int write(NoticeVo vo) {
		//커넥션 준비
		//sq;
		//트랜젝션 자원반납
		
		Connection conn = JDBCTemplate.getConnection();
		
		int result = new NoticeDao().insertNotice(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

}
