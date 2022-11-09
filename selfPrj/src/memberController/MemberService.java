package memberController;

import java.sql.Connection;

import memberCommon.JDBCTemplate;
import memberVo.MemberVo;

public class MemberService {

	public int join(MemberVo vo) {
		Connection conn = JDBCTemplate.getConnection();
		
		int result = new MemberDao().join(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}

	public MemberVo login(MemberVo vo) {
		Connection conn = JDBCTemplate.getConnection();
		
		MemberVo loginMember = new MemberDao().selectOne(conn, vo);
		
		if(loginMember != null) {
			JDBCTemplate.close(conn);
		}else {
			System.out.println("로그인이 null!");
		}
		
		return loginMember;
		
	}
	
	

}
