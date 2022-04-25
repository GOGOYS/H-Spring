package com.callor.school.service;

import java.util.List;

import com.callor.school.domain.StudentVO;

public interface StudentService {

	/*
	 * CRUD 매서드
	 * 데이터베이스와 관련된 인터페이스에서는 최소한 아래의 5가지 메서드는 구현해야한다.
	 * 
	 * CRUD method의 prototype선언
	 * C( Create, insert) : 새로운 데이터추가
	 * R( Read, selectAll, findByStNum) : 데이터 읽기
	 * U( Update, update) : 기존 데이터 변경
	 * D( Delete, delete) : 기존 데이터 중 삭제 
	 */
		public List<StudentVO> selectAll();
		public StudentVO findByStNum(String Num);
		public Integer insert(StudentVO stVO);
		public Integer update(StudentVO stVO);
		public Integer delete(String stNum);
		
		public List<StudentVO>findByStTel(String stTel);
		public List<StudentVO>findByStName(String stName);
		public List<StudentVO>findByStAddr(String stAddr);
		
		//위의 메서드들을 인스턴스로 만드는 것이 구현클래스 = 구현체 이다.
}
