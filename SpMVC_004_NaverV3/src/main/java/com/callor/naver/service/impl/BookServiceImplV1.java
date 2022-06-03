package com.callor.naver.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.callor.naver.config.NaverConfig;
import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.model.NaverParent;
import com.callor.naver.persistance.BookDao;
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
	
	private final BookDao bookDao;
	
	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

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
		
		List<BookVO> booklist = bookDao.selectAll();
		return booklist;
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

	@Override
	public BookVO save(BookVO bookVO) {
		List<BookVO> booklist = bookDao.selectAll();
		
		bookDao.insert(bookVO);
		return null;
	}

	
	
}
