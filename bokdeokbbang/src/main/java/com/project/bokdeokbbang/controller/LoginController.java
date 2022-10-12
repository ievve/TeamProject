package com.project.bokdeokbbang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.bokdeokbbang.dao.UserVo;
import com.project.bokdeokbbang.service.LoginUserService;

@Controller
@SessionAttributes("loginUser")
public class LoginController { //LoginUser컨트롤러

	@Autowired
	private LoginUserService loginUserService;
	
	@GetMapping("/login_form")
	public String loginFormView() {
		return "login";
	}
//	@PostMapping("/login_form")
//	public String loginAction(UserVo vo, Model model) {
//		UserVo loginUser = loginUserService.loginUser(vo);
//	}
}
