package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.service.BookService;


/*
 * bookServiceV1
 * Bookservice interface를 상속받은 클래스가 다수 있을때
 * Controller에서 어떤 클래스를 지금 연결하여 사용할 것인가의
 * 문제가 발생한다.
 * 
 * 그럴때 @Service Annotation 이름(실별자)을 부착하여 두고
 * 클래스 중에서 필요한 부분을 선택할 수 있도록 하기 위하여
 */
@Service(QualifierConfig.SERVICE.BOOKS_V1)
public class BookServiceImplV1 implements BookService{

	@Override
	public List<BookVO> findeByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findeByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findeByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findeByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deldete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
