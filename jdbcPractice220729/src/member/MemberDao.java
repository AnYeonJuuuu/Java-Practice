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
		
		// SQL 실행 (console)
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

	public int join(MemberVo vo, Connection conn) throws Exception{
		//db insert
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			//커넥션 준비 : 서비스클래스에서 할 것임
			
			
			//sql 준비
			String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL, ?, ?, ?)";
			
			//sql 담을 객체 만들기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getNick());
			
			//sql 실행 및 결과 저장
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// 예외 롤백해야하는데 dao는 못함
			// 서비스한테 예외 났다고 알려주면 롤백해주겠지?
			
			// 내가 예외 만들어서, 서비스한테 던지기
			throw e;
			
		} finally {
//			JDBCTemplate.close(conn); 여기서 만든게 아니므로 dao에서 클로즈 하면 안 됨. :: 서비스에서 커밋 롤백해야하는데 클로즈 해 버리면 할 수가 없음
			/*무조건 실행이 되도록(== finally) 만들어서 클로즈 써줘야함!
			try catch 만든 이유 = finally 구문 쓰기 위해서 이므로
			예외를 던져버리게 만듦
			*/
			JDBCTemplate.close(pstmt);	
		}
		
		return result;
		
	}
	
}
















