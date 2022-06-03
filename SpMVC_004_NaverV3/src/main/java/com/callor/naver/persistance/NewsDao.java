package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.NewsVO;

public interface NewsDao extends GenericDao<NewsVO, String>{
	
	/*
	 * GenericDao를 상속 받음으로써  기본 CURD 5개의 method는 만들지 않아도 된다.
	 */

	//기본 5가지 외에 필요한게 있을경우 얼마든지 추가 가능하다.
	public List<NewsVO> findByTitle(String title); 
}
