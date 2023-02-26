package com.ezen.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.dto.ShortsVO;

@Repository
public class ShortsDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	public ShortsVO getShorts(ShortsVO vo) {
		System.out.println("--getShort() 실행: " + vo);
		return mybatis.selectOne("ShortsMapper.getShorts", vo);
	}

	public List<ShortsVO> getShortsList(ShortsVO vo) {
		return mybatis.selectList("ShortsMapper.getShortsList", vo);
	}

	public void insertShorts(ShortsVO vo) {
		mybatis.insert("ShortsMapper.insertShorts", vo);
	}

	public void updateShorts(ShortsVO vo) {
		mybatis.update("ShortsMapper.updateShorts", vo);
		System.out.println("--updateShorts() 실행: " + vo);
	}

	public void deleteShorts(ShortsVO vo) {
		mybatis.delete("ShortsMapper.deleteShorts", vo);
	}

	public int shortsCount(ShortsVO vo) {
		return mybatis.selectOne("ShortsMapper.shortsCount", vo);
	}

	public void shortslikeUpdate(ShortsVO vo) {
		mybatis.update("ShortsMapper.shortslikeUpdate", vo);
	}

	public void updatePay(int sSeq) {
		mybatis.selectOne("ShortsMapper.updatePay", sSeq);
	}
}
