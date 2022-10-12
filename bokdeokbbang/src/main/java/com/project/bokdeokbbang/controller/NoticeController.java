package com.project.bokdeokbbang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bokdeokbbang.service.NoticeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/notice")
@RequiredArgsConstructor

public class NoticeController {
	private NoticeService noticeService;
	@GetMapping("/{u_id}") 
	public String notice(@PathVariable int n_no ,Model model) {
		model.addAttribute("notice",noticeService.findById(n_no));
		return "notice";
	}
}
