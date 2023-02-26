package com.ezen.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.ezen.dto.ShortsVO;
import com.ezen.dto.ShortslikeVO;
import com.ezen.service.ShortsService;
import com.ezen.service.ShortslikeService;

@Controller
public class ShortslikeController {

	@Autowired
	private ShortslikeService service; // shorts like

	@Autowired
	private ShortsService shortsService; // shorts

	@PostMapping("/like")
	public String insertlike(ShortslikeVO vo, Model model, HttpSession session) {

		service.insertlike(vo);

		ShortsVO shorts = new ShortsVO();
		shorts.setsSeq(vo.getsSeq());
		shorts.setCount(service.countlike(vo));
		shortsService.shortslikeUpdate(shorts);
		List<ShortslikeVO> shortslike = service.likeShorts(vo);

		session.setAttribute("shortslike", shortslike);

		return "redirect:home.do";

	}

	@PostMapping("/getlike")
	public String getinsertlike(ShortslikeVO vo, Model model, HttpSession session) {

		service.insertlike(vo);

		ShortsVO shorts = new ShortsVO();
		shorts.setsSeq(vo.getsSeq());
		shorts.setCount(service.countlike(vo));

		shortsService.shortslikeUpdate(shorts);

		List<ShortslikeVO> shortslike = service.likeShorts(vo);

		session.setAttribute("shortslike", shortslike);

		return "redirect:getShorts?sSeq=" + vo.getsSeq();

	}

	@PostMapping("/deletelike")
	public String deletelike(ShortslikeVO vo, HttpSession session) {

		service.deletelike(vo);

		ShortsVO shorts = new ShortsVO();
		shorts.setsSeq(vo.getsSeq());
		shorts.setCount(service.countlike(vo));
		shortsService.shortslikeUpdate(shorts);

		List<ShortslikeVO> shortslike = service.likeShorts(vo);
		session.setAttribute("shortslike", shortslike);

		return "redirect:home.do";
	}

	@PostMapping("/getDeletelike")
	public String getDeleteShorts(ShortslikeVO vo, HttpSession session) {

		service.deletelike(vo);

		ShortsVO shorts = new ShortsVO();
		shorts.setsSeq(vo.getsSeq());
		shorts.setCount(service.countlike(vo));

		shortsService.shortslikeUpdate(shorts);

		List<ShortslikeVO> shortslike = service.likeShorts(vo);
		session.setAttribute("shortslike", shortslike);

		return "redirect:getShorts?sSeq=" + vo.getsSeq();

	}

}
