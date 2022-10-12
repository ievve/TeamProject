package com.project.bokdeokbbang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mysql.cj.protocol.x.Notice;
import com.project.bokdeokbbang.dao.NoticeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class NoticeService {
	private NoticeMapper mapper;
	
	public int noticeCount() {
		return mapper.noticeCount();
	}
	public List<Notice> noticeList() {
		return mapper.findAll();
	}
	public Notice findById(int n_no) {
		return mapper.findById(n_no);
	}
	public int update(Notice notice) {
		 return mapper.update(notice);
	}
	public void deleteById(int n_no) {
		mapper.delete(n_no);
	}
}
