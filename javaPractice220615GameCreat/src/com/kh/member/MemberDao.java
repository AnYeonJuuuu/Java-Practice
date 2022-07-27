package com.kh.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kh.common.JDBCTemplate;

// db에 왔다갔다 할 수 있도록 클래스 작성
public class MemberDao {

	public MemberVo login(String inputid, String inputpwd) throws Exception{
		//db가서, id pwd 일치하는 행 조회
		
		// CONNECTION 준비(TRY CATCH가 의미 없었던 이유(throws Exception으로 던진 이유) 
		// : 문제 발생 상황 시 외부적으로 알려줘야하기 때문에..?)
		Connection conn = JDBCTemplate.getConnection();
		
		// SQL 작성
		String sql = "SELECT NO , ID , NICK FROM MEMBER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
		
		// SQL 객체에 담기
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, inputid);
		pstmt.setString(2, inputpwd);
		
		// SQL 실행 (corsol)
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo vo = null;
		
		if(rs.next()) {
			
			String no = rs.getString("NO"); // db에서 number지만 java에서 문자열로 가져오고 싶다면 ".getString" 이용!!
			String id = rs.getString("ID");
			String nick = rs.getString("NICK");
			
			vo = new MemberVo();
			vo.setId(id);
			vo.setNo(no);
			vo.setNick(nick);
		}
		
		return vo;
		
	}
	
}
















