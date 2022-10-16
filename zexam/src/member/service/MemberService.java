package member.service;




import java.sql.Connection;


import common.JDBCTemplate;
import member.dao.MemberDao;
import member.vo.MemberVo;

public class MemberService {

	public MemberVo login(MemberVo vo) {
		Connection conn =  JDBCTemplate.getConnection();
		//sql -> dao이용
		MemberVo loginMember = new MemberDao().selectOne(conn, vo);
		
		
		JDBCTemplate.close(conn);
		
		return loginMember;

	}

	public int join(MemberVo vo) {

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

	//수정하기
	public MemberVo selectMemberOne(String no) {
		Connection conn = JDBCTemplate.getConnection();
		MemberVo vo = null;
		int result = 0;

		if(result == 1 ) {
			 JDBCTemplate.commit(conn);
			//상세 조회
			vo = new MemberDao().selectNoticeOne(conn, no);
		}
		
		
		JDBCTemplate.close(conn);
		
		return vo;
	}

	public int edit(MemberVo vo) {
		Connection conn  = JDBCTemplate.getConnection();
		//게시글 하나를 번호로 업뎃한다는 의미
		int result = new MemberDao().updateOneByNo(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

}
