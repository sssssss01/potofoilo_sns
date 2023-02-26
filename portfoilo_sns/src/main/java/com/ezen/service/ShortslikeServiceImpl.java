package com.ezen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.dao.ShortslikeDAO;
import com.ezen.dto.ShortslikeVO;

@Service
public class ShortslikeServiceImpl implements ShortslikeService {

	@Autowired
	private ShortslikeDAO dao;

	@Override
	public void insertlike(ShortslikeVO vo) {
		dao.insertlike(vo);
	}

	@Override
	public void deletelike(ShortslikeVO vo) {
		dao.deletelike(vo);

	}

	@Override
	public int countlike(ShortslikeVO vo) {

		return dao.countlike(vo);

	}

	@Override
	public ShortslikeVO like(ShortslikeVO vo) {
		return dao.like(vo);
	}

	@Override
	public List<ShortslikeVO> likeShorts(ShortslikeVO vo) {
		return dao.likeShorts(vo);
	}

}
