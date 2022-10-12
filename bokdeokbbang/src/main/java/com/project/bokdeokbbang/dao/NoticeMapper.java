package com.project.bokdeokbbang.dao;

import java.util.List;

import com.mysql.cj.protocol.x.Notice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	int noticeCount() ; //리턴타입 함수명()
	//리턴 타입이 클래스면 클래스로 맵핑
	List<Notice> findAll() ;
	Object noticeList();
	Notice findById(int n_no);
	void save(Notice notice);
	int update(Notice notice);
	void delete(int n_no);
	
}
