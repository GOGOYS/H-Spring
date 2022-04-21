package com.callor.app.service.impl;

import org.springframework.stereotype.Service;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {

	// TODO 주석을 붙이면 오른쪽에 바로가기가 생겨서 좋다.
	// TODO 학생데이터를 추가하기
	@Override
	public int insert(StudentVO studentVO) {
		return 0;
	}

	// TODO 전체데이터 가져오기
	@Override
	public StudentVO[] selectAll() {
		return null;
	}

	// TODO 학생데이터 ID로 조회하기
	@Override
	public StudentVO findById(String stNum) {
		return null;
	}

}
