package com.kh.board;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*; // JDBC템플릿의 모든 메서드들 사용하겠다 (밑에 코드에서 JDBCTemplate. 삭제해주면 됨) -> 코드 가독성 높아짐.

public class BoardService {

	/*
	 * 게시글 작성
	 * 
	 * 데이터 받기(컨트롤러)
	 * 
	 * 비즈니스 로직 (서비스)
	 * 
	 * db에 insert(dao)
	 * 
	 */
	public int write(BoardVo vo/*전달받은 vo*/) {
		
		// 비스니스 로직 (제목, 내용 1글자 이상인지)
		if(vo.getTitle().length() < 1) {
			// 제목이 비어있음. 다음단계 진행 x 
			return -1;
		}
		
		if(vo.getContent().length() < 1) {
			// 내용이 비어있음. 다음단계 진행 x 
			return -2;
		}
		
		Connection conn = null;
		int result = 0;
		try {
			
			conn = getConnection();
			result = new BoardDao().write(vo, conn);
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
		}catch(Exception e) {
			rollback(conn);
		}finally {
			close(conn);
		}
		
		return result;
		
	}
	
}
