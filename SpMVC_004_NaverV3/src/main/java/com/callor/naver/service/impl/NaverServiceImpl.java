package com.callor.naver.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.NaverConfig;
import com.callor.naver.config.QualifierConfig;
import com.callor.naver.service.NaverService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.NAVER_V0)
public class NaverServiceImpl implements NaverService{
	
	protected String cat = "BOOK";
	
		/*
		 * 카데고리와 서치에 담긴 값을 전달받아서
		 * Naver에 요청할 QueryString을 생성하는 method
		 */
		public String queryString(String cat, String search) {
			
			this.cat = cat;
			//https://open....../book/json
			String queryString = NaverConfig.NAVER_BOOK_URL;
			
			if(cat.equals("NEWS")) {
				queryString = NaverConfig.NAVER_NEWS_URL;
			}else if(cat.equals("MOVIE")) {
				queryString = NaverConfig.NAVER_MOVIE_URL;
				
			}
			
			String encodeSearch = null;
			try {
				encodeSearch = URLEncoder.encode(search, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				log.debug("URL Encoding 오류발생");
				return null;
			}
			
			queryString += String.format("?query=%s", encodeSearch);
			log.debug("Query : " + queryString);
			
			queryString += String.format("&display=%d", 20);
			return queryString;
		}// queryString() 종료
		
		
		/*
		 * queryString을 전달받아 Naver에 데이터를 요청하고
		 * 응답받은 JSON String을 return하기
		 */
		public String getJsonString(String queryString) {
			
			//java.net.URL을 임포트
			URL url = null;
			HttpURLConnection httpCon = null;
			
			//queryString(URL, 요청정보)를 사용하여
			//Network를 통해서 보낼 데이터로 생성하기
			try {
				url = new URL(queryString);
				httpCon = (HttpURLConnection) url.openConnection();
				
				//GET 방식으로 요청한다.
				httpCon.setRequestMethod("GET");
				
				//client 값을 속성으로 저장하라
				httpCon.setRequestProperty(NaverConfig.HEADER_ID, NaverConfig.NAVER_CLIENT_ID);
				httpCon.setRequestProperty(NaverConfig.HEADER_SEC, NaverConfig.NAVER_CLIENT_SEC);
				
				
				//Naver에게 QueryString정보를 보내고 
				//response 해줄 데이터가 있는지 먼저 확인한다.
				int resCode = httpCon.getResponseCode();
				
				BufferedReader buffer = null;
				InputStreamReader is = null;
				
				//Naver가 200 코드를 보내면 데이터를 받아올 통로를 연결하기
				if(resCode == 200) {
					//네이버야 나에게 데이터를 열수있는 통로를 만들어줘
					is = new InputStreamReader(httpCon.getInputStream());
				}else {
					
					//만약 200 코드가 아니면 오류 메시지를 받을 통로 연결
					is = new InputStreamReader(httpCon.getErrorStream());
				}
				
				buffer = new BufferedReader(is);
				
				String retString = "";
				while(true) {
					String line= buffer.readLine();
					if(line == null) break;
					
					retString += line;
				}
				return retString;
				
			} catch (MalformedURLException e) {
				log.debug("Query String 문자열 오류");
				return null;
			} catch (IOException e) {
				log.debug("네트워크 연결을 할 수 없음");
				return null;
			}
			
			
		}


		@Override
		public List<Object> getNaver(String queryString) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
