package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

//인터페이스는 설계도
public interface StudentService {

	// 데이터 추가하기
	public int insert(StudentVO studentVO);

	// 전체리스트 가져오기
	public List<StudentVO> selectAll();

	// 1개의 데이터 가져오기
	public StudentVO findById(String stNum);
}
