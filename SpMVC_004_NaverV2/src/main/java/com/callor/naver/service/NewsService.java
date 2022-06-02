package com.callor.naver.service;

import com.callor.naver.persistance.NewsDao;

/*
 * Service의 기능도 기본적으로 Dao와 같이 CRUD가 필요하고
 * 경우에 따라 별도의 method가 추가될 수도 있다.
 * 
 *  Service도 GenericDao를 상속받아 사용할 수 있다.
 *  그러나 NewsDao에 롭게 추가한 메서드가 있는데
 *  이럴때는 GenericDao 대신 newsDao를 상속받는다.
 */
public interface NewsService  extends NewsDao{

}
