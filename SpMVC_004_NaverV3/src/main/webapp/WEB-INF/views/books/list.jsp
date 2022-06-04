<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/head.jsp"%>
<style>
section div.title {
	margin-top: 30px;
	display: flex;
	padding-bottom: 10px;
	border-bottom: 1px solid #666;
}

.fa-book-bookmark{
	color:#05D686;
	margin-right:4px;
}

section div h1 {
	color: #666;
	width:14%;
	font-size:24px;
	padding-top:0;
}
section div form{
	width:86%;
}
section div form input {
	width: 100%;
	height: 30px;
}

table {
	margin-top: 30px;
}

section div:last-of-type{
margin-top:30px;
	display: flex;
}
section div a {
	padding: 10px 20px;
	background-color: #05D686;
	color: #fff;
	border-radius: 8px;
	font-weight: 900;
	margin-left: auto;
}
</style>

<body>
	<%@ include file="/WEB-INF/views/nav.jsp"%>
	<section class="main">
		<div class="title">
			<i class="fa-solid fa-book-bookmark fa-2x"></i>
			<h1>도서정보 리스트</h1>
			<form method=POST>
				<input name="search" placeholder="검색어를 입력해주세요">
			</form>
		</div>
		<table>
			<colgroup>
				<col width="5%">
				<col width="15%">
				<col width="40%">
				<col width="20%">
				<col width="10%">
				<col width="10%">
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
		<div>
			<a href="${rootPath}/books/insert">도서정보 추가</a>
		</div>	
	</section>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>