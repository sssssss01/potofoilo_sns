package com.ezen.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.dto.ShortsCommentVO;

@Repository
public class ShortsCommentDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertComment(ShortsCommentVO vo) {
		mybatis.insert("ShortsCommentMapper.insertShortsComment", vo);
	}

	public void updateComment(ShortsCommentVO vo) {
		mybatis.update("ShortsCommentMapper.updateShortsComment", vo);
	}

	public void deleteComment(ShortsCommentVO vo) {
		mybatis.delete("ShortsCommentMapper.deleteShortsComment", vo);
	}

	public List<ShortsCommentVO> getCommentList(int sSeq) {
		return mybatis.selectList("ShortsCommentMapper.getShortsCommentList", sSeq);
	}

	public ShortsCommentVO getComment(ShortsCommentVO vo) {
		return mybatis.selectOne("ShortsCommentMapper.getShortsComment", vo);
	}

	public int getCountCommentList(int sSeq) {
		return mybatis.selectOne("ShortsCommentMapper.getCountShortsCommentList", sSeq);
	}

}
