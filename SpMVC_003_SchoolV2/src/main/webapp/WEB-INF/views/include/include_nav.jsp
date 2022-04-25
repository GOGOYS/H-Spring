<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<nav>
	<ul>
	<!-- ${pageContext.request.contextPath}를 넣으면 경로를 알아서 설정해준다. -->
	<!-- corelib을 사용해서 root를 지정해 rootPath를 사용한다. -->
		<li><a href="${rootPath}/">HOME</a></li>
		<li><a href="${rootPath}/student/list_view">학생정보</a></li>
		<li><a href="#">성적일람표</a></li>
		<li><a href="#">로그인</a></li>
	</ul>
</nav>
