package com.ezen.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.dto.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<BoardVO> BoardList(BoardVO vo) {
		return mybatis.selectList("boardMapper.boardList", vo);
	}

	public BoardVO myBoard(BoardVO vo) {
		return mybatis.selectOne("boardMapper.myBoard", vo.getbSeq());
	}

	public List<BoardVO> myBoardList(BoardVO vo) {
		return mybatis.selectList("boardMapper.myBoardList", vo.getId());
	}

	public void insertBoard(BoardVO vo) {
		mybatis.selectList("boardMapper.insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		mybatis.update("boardMapper.updateBoard", vo);
	}

	public void updateCount(BoardVO vo) {
		mybatis.update("boardMapper.updateCount", vo);
	}

	// get 寃뚯떆臾�
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("boardMapper.getBoardList", vo);
	}

	// get �꽴臾롰��
	public List<BoardVO> getAdverList(BoardVO vo) {
		return mybatis.selectList("boardMapper.getAdverList", vo);
	}

	// 占쎄텣占쎌젫
	public void deleteBoard(BoardVO vo) {

		mybatis.delete("boardMapper.deleteBoard", vo);
	}

	// 寃뚯떆臾� 媛��닔
	public int boardCount(BoardVO vo) {
		return mybatis.selectOne("boardMapper.boardCount", vo);
	}

	public void updatePay(int bSeq) {
		mybatis.selectOne("boardMapper.updatePay", bSeq);
	}

	public void updateManusPay(int bSeq) {
		mybatis.selectOne("boardMapper.update-Pay", bSeq);
	}
}
