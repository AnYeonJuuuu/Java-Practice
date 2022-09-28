package com.kh.semi.member.service;

import java.sql.Connection;

import com.kh.semi.common.JDBCTemplate;
import com.kh.semi.member.dao.MemberDao;
import com.kh.semi.member.vo.MemberVo;

public class MemberService {

	// 회원가입
	public int join(MemberVo vo){
		
		// 커넥션 준비
		//sql
		//트랜젝션, 자원반납
	
		Connection conn =  JDBCTemplate.getConnection();
		
		MemberDao dao = new MemberDao();
		int result = dao.insertOne(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		// 자원반납
		JDBCTemplate.close(conn);
		
		return result;
		
	}
	
}
