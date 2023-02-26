package com.ezen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.dao.ShortsCommentDAO;
import com.ezen.dto.ShortsCommentVO;

@Service
public class ShortsCommentServiceImpl implements ShortsCommentService {

	@Autowired
	private ShortsCommentDAO sdao;

	@Override
	public void insertComment(ShortsCommentVO vo) {
		sdao.insertComment(vo);

	}

	@Override
	public void updateComment(ShortsCommentVO vo) {
		sdao.updateComment(vo);

	}

	@Override
	public void deleteComment(ShortsCommentVO vo) {
		sdao.deleteComment(vo);

	}

	@Override
	public List<ShortsCommentVO> getCommentList(int sSeq) {
		return sdao.getCommentList(sSeq);
	}

	@Override
	public ShortsCommentVO getComment(ShortsCommentVO vo) {
		return sdao.getComment(vo);
	}

	@Override
	public int getCountCommentList(int scSeq) {
		return sdao.getCountCommentList(scSeq);
	}

}
