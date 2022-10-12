package com.project.bokdeokbbang.controller;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bokdeokbbang.dao.NoticeMapper;
import com.project.bokdeokbbang.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class MainController {
	
	@Autowired
	NoticeMapper mapper;
	
	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("cnt",mapper.noticeCount());
		model.addAttribute("test", mapper.noticeList());
		return "test";		
	}
	@GetMapping
	public String notice(Model model) {
		model.addAttribute("notice",mapper.noticeList());	
		return "notice";		
	}
	

	@GetMapping("/notice")
	public String notice() {
		return "notice";
	}
}