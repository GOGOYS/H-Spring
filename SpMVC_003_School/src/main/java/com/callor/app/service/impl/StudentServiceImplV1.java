package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {
	
	//web application에서는 Service의 클래스 영역에 변수를 선언하지 않는다.
	
	// TODO 주석을 붙이면 오른쪽에 바로가기가 생겨서 좋다.
	// TODO 학생데이터를 추가하기
	@Override
	public int insert(StudentVO studentVO) {
		return 0;
	}
	
	
	
	// TODO 학생데이터 ID로 조회하기
	@Override
	public StudentVO findById(String stNum) {
		return null;
	}



	// TODO 학생 리스트 만들기
	@Override
	public List<StudentVO> selectAll() {
		
		List<StudentVO> stList = new ArrayList<>();
		
		StudentVO stVO = new StudentVO();
		
		
		//stVO에 담긴값는 제일 마지막에 세팅된 데이터만 담긴다.
		//홍길동을 담고 이몽룡을 담으면 기존에 저장을 해놨어도 모두 이몽룡으로 데이더 값으로 바뀐다.
		//데이터의 주소를 똑같은것을 가져와서 쓰기 때문.
		stVO.setStNum("00001");
		stVO.setStName("홍길동");
		stVO.setStDept("컴공과");
		stVO.setIntGrade(3);
		stVO.setStAddr("서울턱별시");
		stList.add(stVO);
		
		stVO = new StudentVO();
		stVO.setStNum("00002");
		stVO.setStName("이몽룡");
		stVO.setStDept("전자과");
		stVO.setIntGrade(2);
		stVO.setStAddr("전라북도 익산시");
		stList.add(stVO);
		
		
		//데이터의 주소를 변경해줘야만 새로운 데이터의 주소값에 새로 데이터가 담긴다.
		//stVO = new StudentVO();를 해줘야만 가능.
		/*
		 * vo데이터를 사용하여 새로운 학생정보를 list에 추가하기 위해서는 반드시 vo를 다시 생성해 주어야한다.
		 */
		stVO = new StudentVO(); //vo를 다시 생성하기
		stVO.setStNum("00003");
		stVO.setStName("성춘향");
		stVO.setStDept("법학과");
		stVO.setIntGrade(3);
		stVO.setStAddr("전라북도 남원시");
		stList.add(stVO);
		
		stVO = new StudentVO(); //vo를 다시 생성하기
		stVO.setStNum("00004");
		stVO.setStName("임꺽정");
		stVO.setStDept("체육학과");
		stVO.setIntGrade(4);
		stVO.setStAddr("함경북도 함흥시");
		stList.add(stVO);
		
		stVO = new StudentVO(); //vo를 다시 생성하기
		stVO.setStNum("00005");
		stVO.setStName("장보고");
		stVO.setStDept("해양생물학과");
		stVO.setIntGrade(1);
		stVO.setStAddr("전라북도 완도군");
		stList.add(stVO);
		return stList;
	}

}
