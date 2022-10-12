package com.project.bokdeokbbang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bokdeokbbang.dao.LoginDao;
import com.project.bokdeokbbang.dao.UserVo;

import lombok.Data;

@Data
@Service("loginUserService")

public class LoginUserServiceImpl implements LoginUserService{
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public void joinUser(UserVo vo) {
		loginDao.joinUser(vo);
	}
	@Override
	public UserVo idCheck(String a_id) {
		return loginDao.idCheck(a_id);
	}
}
