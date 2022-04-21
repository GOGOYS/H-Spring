<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav>
	<ul>
	<!-- ${pageContext.request.contextPath}를 넣으면 경로를 알아서 설정해준다. -->
		<li><a href="${pageContext.request.contextPath}/">HOME</a></li>
		<li><a href="${pageContext.request.contextPath}/student">학생정보</a></li>
		<li><a href="#">성적일람표</a></li>
		<li><a href="#">로그인</a></li>
	</ul>
</nav>
