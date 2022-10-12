package com.project.bokdeokbbang.dao;

import java.util.List;

import com.mysql.cj.protocol.x.Notice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	int noticeCount() ; //����Ÿ�� �Լ���()
	//���� Ÿ���� Ŭ������ Ŭ������ ����
	List<Notice> findAll() ;
	Object noticeList();
	Notice findById(int n_no);
	void save(Notice notice);
	int update(Notice notice);
	void delete(int n_no);
	
}
