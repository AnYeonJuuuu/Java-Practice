package member.dao;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import common.JDBCTemplate;
import member.vo.MemberVo;


public class MemberDao {
	public MemberVo selectOne(Connection conn, MemberVo vo) {
		//sql실행
		String sql = "SELECT NO,ID,NAME,PWD,EMAIL,PHONE,GRADE,ENROLL_DATE,MODYFY_DATE,STATUS FROM E_MEMBER WHERE ID = ? AND PWD = ? AND STATUS = 'O'";
		ResultSet rs = null;
		MemberVo loginMember = null;
		PreparedStatement pstmt = null;

		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				String eMail = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				String grade = rs.getString("GRADE");
				String enrollDate = rs.getString("ENROLL_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");
				String status = rs.getString("STATUS");
				
				loginMember = new MemberVo();
				loginMember.setId(id);
				loginMember.setPwd(pwd);
				loginMember.setNo(no);
				loginMember.setName(name);
				loginMember.seteMail(eMail);
				loginMember.setPhone(phone);
				loginMember.setGrade(grade);
				loginMember.setEnrollDate(enrollDate);
				loginMember.setModifyDate(modifyDate);
				loginMember.setStatus(status);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		
		
		return loginMember;
	}

	public int insertOne(Connection conn, MemberVo vo) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "INSERT INTO E_MEMBER VALUES ( SEQ_MEMBER_NO.NEXTVAL , ? , ? , ? , ? , ? ,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
//			conn.setAutoCommit(false);
			
			
			pstmt.setString(1,vo.getId());
			pstmt.setString(2,vo.getPwd());
			pstmt.setString(3,vo.getName());
			pstmt.setString(4,vo.geteMail());
			pstmt.setString(5,vo.getPhone());
			pstmt.setString(6,vo.getGrade());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public MemberVo selectNoticeOne(Connection conn, String no) {

		//sql(준비, 완성, 실행 및 결과저장)
		String sql = "SELECT NO,ID,NAME,PWD,EMAIL,PHONE,GRADE,ENROLL_DATE,MODYFY_DATE,STATUS FROM E_MEMBER WHERE NO = ? AND N.STATUS = 'O'";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo loginMember = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
		
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");

				String name = rs.getString("NAME");
				String eMail = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				String grade = rs.getString("GRADE");
				String enrollDate = rs.getString("ENROLL_DATE");
				String modifyDate = rs.getString("MODIFY_DATE");
				String status = rs.getString("STATUS");
				
				loginMember = new MemberVo();
				loginMember.setId(id);
				loginMember.setPwd(pwd);

				loginMember.setName(name);
				loginMember.seteMail(eMail);
				loginMember.setPhone(phone);
				loginMember.setGrade(grade);
				loginMember.setEnrollDate(enrollDate);
				loginMember.setModifyDate(modifyDate);
				loginMember.setStatus(status);
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		
		return loginMember;
	}

	public int updateOneByNo(Connection conn, MemberVo vo) {
		
		String sql = "UPDATE E_MEMBER SET ID = ?, PWD = ?, NAME = ? , EMAIL = ? , PHONE = ?, GRADE = ?  MODIFY_DATE = SYSDATE WHERE NO = ?";
		

		
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,vo.getId());
			pstmt.setString(2,vo.getPwd());
			pstmt.setString(3,vo.getName());
			pstmt.setString(4,vo.geteMail());
			pstmt.setString(5,vo.getPhone());
			pstmt.setString(6,vo.getGrade());
			pstmt.setString(7,vo.getNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	
	}
}
