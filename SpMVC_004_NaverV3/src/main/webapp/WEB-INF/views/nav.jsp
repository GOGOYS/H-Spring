<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
		<p>NAVER API를 활용한 검색 정보 서비스</p>
	</header>
	<nav>
		<ul>
			<li><a href="${rootPath}/">홈</a></li>
			<li><a href="${rootPath}/books">도서정보</a></li>
			<li><a href="${rootPath}/news/list">뉴스정보</a></li>
			<li><a href="${rootPath}/movies">영화정보</a></li>
			<li><a href="${rootPath}/naver">네이버체험하기</a></li>
			
			<% // 로그인을 하지 않았을때 %>
			<c:if test ="${ empty MEMBER }">
			<li><a href="${rootPath}/member/login">로그인</a></li>
			<li><a href="${rootPath}/member/join">회원가입</a></li>
			</c:if>
				
			<% // 로그인을 했을때는 MEMBER 객체에 로그인한 사용자 정보가 담겨있다. %>
			
			<c:if test = "${ not empty MEMBER }">
			<li><a href="${rootPath}/member/mypage">마이페이지</a></li>
			<li><a href="${rootPath}/member/logout">로그아웃</a></li>
			</c:if>
		</ul>
	</nav>