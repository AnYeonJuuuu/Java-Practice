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

	public MemberVo login(MemberVo vo) {
		//커넥션 준비
		Connection conn =  JDBCTemplate.getConnection();
		//sql -> dao이용
		MemberVo loginMember = new MemberDao().selectOne(conn, vo);
		
		
		JDBCTemplate.close(conn);
		
		return loginMember;
		//트랜젝션, 자원반납
	
	}

	//회원정보 수정
	public MemberVo edit(MemberVo vo) {
		
		//커넥션 준비
		
		//sql(update, select)
		
		//트랜젝션 처리, 자원반납
		
		Connection conn = JDBCTemplate.getConnection();
		
		//(회원번호를 가지고)업데이트 쿼리문 실행
		int result = new MemberDao().updateOneByNo(conn, vo);
		
		MemberVo updatedMember = null;
		if(result == 1) {
			JDBCTemplate.commit(conn);
			// 업데이트가 되면 조회해야 하므로 == select 쿼리문 실행
			// .selectOne == 로그인 할 때 만들었음
			updatedMember = new MemberDao().selectOne(conn, vo);
			
		}else {
			JDBCTemplate.rollback(conn);

		}

		JDBCTemplate.close(conn);
		
		return updatedMember;
	}

	//회원 탈퇴
	public int quit(String no) {
		//커넥션 준비
		
		//sql
		
		//트랜젝션 처리
	
		Connection conn = JDBCTemplate.getConnection();
		
		int result = new MemberDao().quit(conn, no);
		
		if(result == 1 ) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	
}
