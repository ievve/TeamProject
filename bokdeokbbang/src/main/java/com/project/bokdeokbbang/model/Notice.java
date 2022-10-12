package com.project.bokdeokbbang.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Notice {
	private int n_no ;
	
	private String n_title;
	private String n_content;
	private Date createDate;
	private Date ChangeDate;
	private Integer n_view;
	private String u_id;
	
	public Notice(String n_title, String n_content, String u_id) {
		this.n_title = n_title;
		this.n_content = n_content;
		this.u_id = u_id;
	}
}
