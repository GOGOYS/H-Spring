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
<title>Insert title here</title>
</head>
<body>
	<h1>도서정보 리스트 보여주기</h1>
	<form method=POST>
		<input name="search" placeholder="검색어를 입력해주세요">
	</form>
	<table>
	<colgroup>
				<col width="50px">
				<col width="200px">
				<col width="500px">
				<col width="200px">
				<col width="200px">
				<col width="200px">
			</colgroup>
	<thead>
		<tr>
			<th>NO.</th>
			<th>ISBN</th>
			<th>제목</th>
			<th>출판사</th>
			<th>저자</th>
			<th>출판일</th>
		</tr>
	</thead>
	
		
		<c:choose>
		<c:when test="${not empty BOOKLIST}">
			<tr>
			<td></td>
			<td>${BOOKLIST.isbn}</td>
			<td>${BOOKLIST.title}</td>
			<td>${BOOKLIST.publisher}</td>
			<td>${BOOKLIST.author}</td>
			<td>${BOOKLIST.pubdate}</td>
			</tr>
		</c:when>
		
		
	</c:choose>
	</table>
	<a href="${rootPath}/books/insert">도서정보 추가</a>

</body>
</html>