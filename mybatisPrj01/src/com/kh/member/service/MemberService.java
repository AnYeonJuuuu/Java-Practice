package com.kh.member.service;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.common.db.JDBCTemplate;
import com.kh.member.dao.MemberDao;
import com.kh.member.vo.MemberVo;

public class MemberService {
	
	public int join(MemberVo vo) {
		//커넥션 준비
		//Connection conn = JDBCTemplate.getConnetion();
		SqlSession ss =  JDBCTemplate.getSqlSession();
		
		//sql 실행
		MemberDao dao = new MemberDao();
		int result = dao.join(ss, vo);
		
		//트랜젝션 처리 및 자원 반납
		if(result == 1) {
			//JDBCTemplate.commit(conn);
			ss.commit();
		}else {
			//JDBCTemplate.rollback(conn);
			ss.rollback();
		}
		
		//JDBCTemplate.close(conn);
		ss.close();
		
		//결과 리턴
		return result;
	}

	//전체 회원 목록 조회
	public List<MemberVo> selectmemberListAll() {
		//커넥션 준비
		//mybatis에선 .getSqlSession(); 이용!
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//sql실행
		MemberDao dao = new MemberDao();
		List<MemberVo> list =  dao.selectMemberListAll(ss);
		//자원정리
		//sqlSession 정리
		ss.close();
		
		//리턴
		return list;
	}
}
