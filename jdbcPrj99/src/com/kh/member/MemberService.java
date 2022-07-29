package com.kh.member;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;

public class MemberService {

	public int join(MemberVo vo) {
		// 아이디, 패스워드 유효성 검사, 아이디 중복확인
		// 변수가 4개라 괜찮지만, 변수가 더 많아지면..? -> 칼럼 2~30개 있으면 :: MemberVo 생성
		
		// 아이디 4글자 이상인지
		if(vo.getId().length() < 4) {
			// 다음단계 진행하면 안 됨. 실패라고 알려줘야함
			return -1;
		}
		
		// 패스워드 4글자 이상인지
		if(vo.getPwd().length() < 4) {
			// 다음단계 진행하면 안 됨. 실패라고 알려줘야함
			return -2; // 1 말고 다른 값 들어가면 됨
		}
		
		// 패스워드 일치하는지 (비밀번호 확인)
		if(vo.getPwd().equals(vo.getPwd2()) == false) {
			// 다음단계 진행하면 안 됨. 실패라고 알려줘야함.
			return -3;
		}
		
		// 아이디 중복확인
		
		// 위의 조건들 모두 통과하면? -> insert 진행 : 인서트하려면 db에 다녀와야하므로
		
		Connection conn = null;
		
		int result = 0;
		
		try {
			// 커넥션 연결을 여기서!
			conn = JDBCTemplate.getConnection();
			// 인서트 작업은 new MemberDao().join(vo, conn); 이 한 줄!!!!!!!!!
			// 
			result = new MemberDao().join(vo, conn);
			
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (Exception e) {
			// 롤백해야하는 상황
			e.printStackTrace();
			JDBCTemplate.rollback(conn);
		} finally {
			JDBCTemplate.close(conn);
		}
		
				
		return result;
	
		
	}
	
	
	
	
	
	
}
