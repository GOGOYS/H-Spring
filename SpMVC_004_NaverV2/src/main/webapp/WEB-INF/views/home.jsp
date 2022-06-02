<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>나의 API App</title>
<link rel="stylesheet" href="${rootPath}/static/css/main.css?ver=2022-06-02-002">
<link rel="stylesheet" href="${rootPath}/static/css/home.css?ver=2022-06-02-004">
<link rel="stylesheet" href="${rootPath}/static/css/table.css?ver=2022-06-02-002">

<link rel="stylesheet" href="${rootPath}/static/css/modal.css?ver=2022-05-31-007">
<link rel="stylesheet" href="${rootPath}/static/css/input.css?ver=2022-05-31-001">

<script>
	const rootPath = "${rootPath}"
</script>

<script src="${rootPath}/static/js/input.js?ver=2022-05-31-003"></script>

</head>
<body>
	<header>
		<h1>My Api</h1>
		<p>Naver Api를 활용한 도서,뉴스, 영화 정보 서비스</p>
	</header>
	<nav>
		<ul>
			<li><a href="${rootPath}/">홈</a></li>
			<li><a href="${rootPath}/books/list">도서정보</a></li>
			<li><a href="${rootPath}/news/list">뉴스정보</a></li>
			<li><a href="${rootPath}/movies">영화정보</a></li>
			
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
	<section class="main">
	</section>
	<footer>
		<address>CopyRight &copy; qaz75391@naver.com</address>
	</footer>
	
</body>

</html>