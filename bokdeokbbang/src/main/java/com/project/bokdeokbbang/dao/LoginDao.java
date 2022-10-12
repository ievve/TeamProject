package com.project.bokdeokbbang.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class LoginDao {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void joinUser(UserVo vo) {
		System.out.println("==> Mybatis�� joinUser() ��� ó��");
		
		mybatis.insert("LoginDao.joinUser",vo);
	}
	public UserVo idCheck(String a_id) {
		System.out.println("==> Mybatis�� idCheck() ��� ó��");
		UserVo user = mybatis.selectOne("LoginDao.idCheck", a_id);
		return user;
	}
	

}
