<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>

<%@ include file ="/WEB-INF/views/head.jsp" %>
<style>
	form{
		display:flex;
		justify-content: space-around;
		width: 60%;
		margin:10px auto;
	}
	
	select, input{
		padding: 8px;
		margin: 5px;
	}
	
	input{
	flex:1;
	}
</style>

<body>
	<%@ include file ="/WEB-INF/views/nav.jsp" %>
	<section class="main">
	<form method=POST>
		<select name="cat">
			<option value="BOOK">도서검색</option>
			<option value="NEWS">뉴스검색</option>
			<option value="MOVIE">영화검색</option>
		</select>
		<input name="search" placeholder="검색어를 입력하세요">
		<button>검색</button>
	</form>	
	</section>
	<%@ include file ="/WEB-INF/views/footer.jsp" %>
</body>
</html>