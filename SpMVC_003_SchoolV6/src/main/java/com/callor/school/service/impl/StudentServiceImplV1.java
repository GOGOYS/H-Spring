package com.callor.school.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.callor.school.dao.StudentDao;
import com.callor.school.model.StudentVO;
import com.callor.school.service.StudentService;

import lombok.extern.slf4j.Slf4j;

// StudenService stSerive = new StudentServiceImplV1();
// StudentServiceImplV1 대신에 @Service("stService")를 사용해서 stService라는 이름으로 쓰게따
//	private static final Logger log
//		=LoggerFactory.getLogger(StudentServiceImplV1.class);
// 를 쓰지 않아도 lombok을 사용해 @slf4j를 사용하면 logback을 쓸수있다.	
@Slf4j
@Service("stService1")
public class StudentServiceImplV1 implements StudentService{
	
	/*
	 * 생성자 주입
	 */
	private final StudentDao stDao;
	public StudentServiceImplV1(StudentDao stDao) {
		this.stDao = stDao;
	}

	@Override
	public List<StudentVO> selectAll() {
		// TODO Auto-generated method stub
		return stDao.selectAll();
	}

	@Override
	public StudentVO findByNum(String st_num) {
		// TODO Auto-generated method stub
		return stDao.findByNum(st_num);
	}

	@Override
	public int insert(StudentVO stVO) {
		// TODO Auto-generated method stub
		int count = stDao.insert(stVO);
		return count;
	}

	@Override
	public int update(StudentVO stVO) {
		// TODO Auto-generated method stub
		int count = stDao.update(stVO);
		return count;
	}

	@Override
	public int delete(String st_num) {
		// TODO Auto-generated method stub
		int count = stDao.delete(st_num);
		return count;
	}

}
