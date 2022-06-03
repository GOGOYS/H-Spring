<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<script src="${rootPath}/static/js/save.js?ver=2022-06-03-02"></script>

		<form class="join" method="POST">
			<div>
				<input id="isbn" name="isbn" placeholder="ISBN">
				<input  id="title" name="title" placeholder="도서명 입력후 Enter">
			</div>
			<div>
				<input name="author" placeholder="저자">
				<input name="publisher" placeholder="출판사">
				<input name="price" placeholder="가격">
				<input name="discount" placeholder="할인가">
			</div>
			
			<div>
				<input name="description" placeholder="내용" >
				<input name="pubdate" placeholder="출판일">
				<input name="link" placeholder="경로">
				<input name="image" placeholder="이미지">
			</div>
				
			<button  class="join" type="button">저장</button>
		</form>	
	