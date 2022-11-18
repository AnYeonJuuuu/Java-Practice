package com.kh.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.common.db.JDBCTemplate;
import com.kh.member.vo.MemberVo;

public class MemberDao {

	//회원가입
	public int join(SqlSession ss, MemberVo vo) {
		
		//쿼리문은 써줘야함! 그외 나머지는 밑에 한 줄이 다 처리!
		//memberMapper의 join을 실행학라는 뜻!, 쿼리문 안쪽 물음표를 vo로 채워줌!
		return ss.insert("memberMapper.join", vo);
		
//		//sql준비
//		String sql = "INSERT INTO MEMBER(ID,PWD) VALUES(? , ?)";
//		PreparedStatement pstmt = null;
//		int result = 0;
//		try {
//			pstmt = ss.prepareStatement(sql);
//			//완성
//			pstmt.setString(1, vo.getMemberId());
//			pstmt.setString(2, vo.getMemberPwd());
//			
//			//실행
//			result = pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			JDBCTemplate.close(pstmt);
//		}
//		
//		//결과 리턴
//		return result;
	}

	//전체 회원 목록 조회
	public List<MemberVo> selectMemberListAll(SqlSession ss) {
		
		//.selelctList라는 mybatis가 이미 만들어 놓은 메소드를 호출하는 것!
		return ss.selectList("memberMapper.selectAll");
		
		//sql 실행 (준비, 완성, 실행)
		
		
		//rs -> 객체
		
		//여러개의 객체를 list로 변환
		
		//return list
		
	}
	
}
