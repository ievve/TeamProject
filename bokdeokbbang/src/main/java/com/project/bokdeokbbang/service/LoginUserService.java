package com.project.bokdeokbbang.service;

import com.project.bokdeokbbang.dao.UserVo;

public interface LoginUserService {
	
	void joinUser(UserVo vo);
	UserVo idCheck(String a_id);
}
