<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<head>
<meta charset="UTF-8">
<title>고려 고교 성적처리</title>
<!-- 파일을 바꿨을때 톰캣에서는 같은 이름명이면  똑같은 파일인줄 알고 업데이트를 안한다.
뒤에 버전명을 붙여주면 업로드할때마다 버전을 바꿔주면 된다.-->
<link rel="stylesheet" href='${rootPath}/static/css/main.css?ver=2022-04-26-0001'>
</head>