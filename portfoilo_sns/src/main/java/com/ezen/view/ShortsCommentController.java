package com.ezen.view;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ezen.dto.MemberVO;
import com.ezen.dto.ShortsCommentVO;
import com.ezen.service.ShortsCommentService;

@RequestMapping("/comments")
@RestController
public class ShortsCommentController {
	
	@Autowired
	private ShortsCommentService service;
	
	@PostMapping(value="/insertComment")
	public String insertComment(ShortsCommentVO vo, HttpSession session) {
		
		MemberVO user= (MemberVO) session.getAttribute("user");
		
		if(session.getAttribute("user") == null) {
			return "not_login";
			
		}else {
			vo.setId(user.getId());
			
			service.insertComment(vo);

			return "success";
			
		}	
	}
	

	@PostMapping(value="/updateComment")
	public String updateComment(ShortsCommentVO vo, Model model, HttpSession session)throws IOException {
		MemberVO user = (MemberVO)session.getAttribute("user");
		System.out.println("updateComment vo: " + vo);
		
		if(session.getAttribute("user") == null) {
			return "not_login";
			
		//}else if (user.getId() != vo.getId()) {
		//	return "getShortsList";
			
		} else {
			ShortsCommentVO comment = service.getComment(vo);
			
			model.addAttribute("comment", comment);
			
			service.updateComment(vo);
			return "success";
		}
	}
	
	@RequestMapping(value="/deleteComment")
	public String deleteComment(ShortsCommentVO vo, HttpSession session) {
		MemberVO user = (MemberVO)session.getAttribute("user");
		
		if(session.getAttribute("user") == null) {
			return "not_login";
		}else {		
			service.deleteComment(vo);
			return "success";
		}
	}
	
	@RequestMapping(value="/getCommentList", produces="application/json; charset=UTF-8")
	@ResponseBody
	public Map<String, Object> getCommentList(ShortsCommentVO vo){
		//System.out.println("getCommentList vo: "+ vo);
		
		Map<String, Object> comment = new HashMap<>();
		
		List<ShortsCommentVO> list = service.getCommentList(vo.getsSeq());
		for(ShortsCommentVO sc : list) {
			System.out.println("getCommentList commentList="+sc);
		}
		comment.put("total", list.size());
		comment.put("commentList", list);
		
		return comment;
		
	}

}
