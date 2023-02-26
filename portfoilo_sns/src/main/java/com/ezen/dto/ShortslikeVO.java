package com.ezen.dto;

public class ShortslikeVO {
	
	private int like_seq;   //shortslike seq;
	private int sSeq;   //Shorts seq
	private String id;   // id
	private int like_cnt;   //like count
	
	public int getLike_seq() {
		return like_seq;
	}
	public void setLike_seq(int like_seq) {
		this.like_seq = like_seq;
	}
	public int getsSeq() {
		return sSeq;
	}
	public void setsSeq(int sSeq) {
		this.sSeq = sSeq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLike_cnt() {
		return like_cnt;
	}
	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}
	@Override
	public String toString() {
		return "ShortslikeVO [like_seq=" + like_seq + ", sSeq=" + sSeq + ", id=" + id + ", like_cnt=" + like_cnt + "]";
	}
	
	
	
}