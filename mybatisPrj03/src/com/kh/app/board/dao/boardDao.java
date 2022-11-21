package com.kh.app.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;

public class boardDao {
	
	//게시글 작성
	public int write(SqlSession ss, BoardVo vo) {
		//한 줄 코드로 insert가 실행 됨!
		return ss.insert("boardMapper.write", vo);
	}

	//게시글 목록 조회
	public List<BoardVo> selectBoardList(SqlSession ss, Map<String, String> map) {
		//board-mapper쪽에서 마이바티스가 알아서 List타입으로 데려옴
		//map 추가
		return ss.selectList("boardMapper.selectBoardList", map);
	}

	//게시글 갯수 조회
	public int selectCount(SqlSession ss) {
		return ss.selectOne("boardMapper.selectCnt");
	}

}












