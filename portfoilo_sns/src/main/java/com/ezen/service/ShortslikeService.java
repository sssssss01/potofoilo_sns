package com.ezen.service;

import java.util.List;

import com.ezen.dto.ShortslikeVO;

public interface ShortslikeService {

	void insertlike(ShortslikeVO vo);

	void deletelike(ShortslikeVO vo);

	int countlike(ShortslikeVO vo);

	ShortslikeVO like(ShortslikeVO vo);

	List<ShortslikeVO> likeShorts(ShortslikeVO vo);

}