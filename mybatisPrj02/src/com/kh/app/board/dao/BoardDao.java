package com.kh.app.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.board.vo.SearchVo;

public class BoardDao {

	//게시글 작성하기(찐)
	public int write(SqlSession ss, BoardVo vo) {
		
		//sql 실행
		//바로 리턴!! (앞으로 dao코드는 한 줄로 작성 할 것!)
		//"네임스페이스.id"
		return ss.insert("boardMapper.write",vo);
		
	}

	public List<BoardVo> selectBoardList(SqlSession ss) {
		
		return ss.selectList("boardMapper.selectList");
				
				
	}

	//게시글 검색 목록 조회
	public List<BoardVo> searchBoardList(SqlSession ss, Map<String, String> map) {
		//vo의 키워드가 null인지 "" 인지 검사 -> n
		return ss.selectList("boardMapper.searchList",map);
		
	}
}
