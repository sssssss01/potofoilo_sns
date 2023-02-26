package com.ezen.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShortsCommentVO {
	
	private int scSeq;
	private int sSeq;
	private String id;
	private String content;
	private Date indate;

	public int getScSeq() {
		return scSeq;
	}
	public void setScSeq(int scSeq) {
		this.scSeq = scSeq;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getIndate() {
		return indate;
	}
	public void setInDate(Date indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "ShortsCommentVO [scSeq=" + scSeq + ", sSeq=" + sSeq + ", id=" + id + ", content=" + content
				+ ", indate=" + indate + "]";
	}
	
	

}
