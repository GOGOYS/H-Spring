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
	<table>
		<c:forEach items="${BOOKLIST}" var="VO">
			<tr data-isbn="${VO.isbn}">
				<td>${VO.ISBN}</td>
				<td>${VO.TITLE}</td>
				<td>${VO.PUBLISHER}</td>
				<td>${VO.AUTHOR}</td>
				<td>${VO.PUBDATE}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${rootPath}/books/insert">도서정보 추가</a>

</body>
</html>