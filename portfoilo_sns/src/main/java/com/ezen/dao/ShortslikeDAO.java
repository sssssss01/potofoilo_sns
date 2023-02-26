package com.ezen.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.dto.ShortsVO;
import com.ezen.dto.ShortslikeVO;

@Repository
public class ShortslikeDAO {
	
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertlike(ShortslikeVO vo) {
		mybatis.insert("ShortslikeMapper.insertlike", vo);
	}
	
	public void deletelike(ShortslikeVO vo) {
		mybatis.delete("ShortslikeMapper.deletelike", vo);
	}
	
	
	public List<ShortslikeVO> likeShorts(ShortslikeVO vo) {
		return mybatis.selectList("ShortslikeMapper.likeShorts",vo);
	}
	
	public int countlike(ShortslikeVO vo) {		
		return mybatis.selectOne("ShortslikeMapper.countlike", vo);
				
	}
	
	public ShortslikeVO like(ShortslikeVO vo) {
		return mybatis.selectOne("ShortslikeMapper.like", vo);
	}
	
	
	
}
