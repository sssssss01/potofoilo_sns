package com.ezen.service;

import java.util.List;

import com.ezen.dto.ShortsVO;

public interface ShortsService {

	ShortsVO getShorts(ShortsVO vo);

	void insertShorts(ShortsVO vo);

	void updateShorts(ShortsVO vo);

	void deleteShorts(ShortsVO vo);

	List<ShortsVO> getShortsList(ShortsVO vo);

	int shortsCount(ShortsVO vo);

	void shortslikeUpdate(ShortsVO vo);

	void updatePay(int sSeq);

}