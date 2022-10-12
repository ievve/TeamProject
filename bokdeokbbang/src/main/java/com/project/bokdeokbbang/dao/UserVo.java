package com.project.bokdeokbbang.dao;

import java.util.Date;

import lombok.Data;
@Data
public class UserVo {
	  private String a_id;
	    private String passwd;
	    private String a_name;
	    private Date createDate;
	    private String a_tel;
	    private String e_mail;
	   
	    @Override
	    public String toString() {
	        return "UserVO [a_id=" + a_id + ", passwd=" + passwd + ", a_name=" + a_name + ", "
	        		+ "createDate=" + createDate + "a_tel=" + a_tel + "e_mail=" + e_mail + "]";
	    }
}
