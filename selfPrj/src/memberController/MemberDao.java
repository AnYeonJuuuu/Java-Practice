package memberController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import memberCommon.JDBCTemplate;
import memberVo.MemberVo;

public class MemberDao {

	public int join(Connection conn, MemberVo vo) {
		String sql = "INSERT INTO MEMBER2 (NO, ID, PWD) VALUES (SEQ_MEMBER2_NO.NEXTVAL ,?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getUserId());
			pstmt.setString(2, vo.getUserPwd());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
		
	}

	//로그인
	public MemberVo selectOne(Connection conn, MemberVo vo) {
		String sql = "SELECT * FROM MEMBER2 WHERE ID = ? AND PWD = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo loginMember = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserId());
			pstmt.setString(2, vo.getUserPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String userId = rs.getString("ID");
				String userPwd = rs.getString("PWD");
				
				loginMember = new MemberVo();
				loginMember.setUserId(userId);
				loginMember.setUserPwd(userPwd);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		
		return loginMember;		
	}

}
