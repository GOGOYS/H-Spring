<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/head.jsp"%>
<style>


	section div.title{
	
	width:50%;
	margin:30px auto 0;
	padding-bottom: 10px;
	border-bottom: 1px solid #666;	
	margin-bottom: 20px;
	display: flex;
	justify-content: center;
	}
	section div h1{
	display: inline-block;
	color: #666;
	
	}
	section form{
		margin-top:20px;
		width: 50%;
		margin: auto;
		display: flex;
		flex-direction: column;
	}
	
	section form div{
		flex:1;
		display:flex;
		margin-bottom:10px;
	}
	
	input{
		height:30px;
	}
	
	#btn{
		display: flex;
		justify-content: flex-end;
	}
	
	#btn button{
		padding: 10px 20px;
		background-color: #05D686;
		color: #fff;
		border-radius: 8px;
		font-weight: 900;
		border:none;
	}
	
	#btn button:nth-of-type(2){
		background-color: #6efac6;
		margin-left:10px;
	}
	#btn a{
		padding: 10px 20px;
		background-color: #007a4c;
		color: #fff;
		border-radius: 8px;
		font-weight: 900;
		border:none;
		margin-left:10px;
	}
	
	#book-1 input:nth-of-type(2){
	margin-left:10px;
	flex-grow: 1;
	}
	
	#book-2 input:nth-of-type(1){
	flex-grow: 1;
	}
	#book-2 input:nth-of-type(2){
	margin-left:10px;
	flex-grow: 1;
	}
	#book-2 input:nth-of-type(3){
	margin-left:10px;
	flex-grow: 1;
	}
	
	#book-3 input:nth-of-type(1){
	flex-grow: 1;
	}
	#book-3 input:nth-of-type(2){
	margin-left:10px;
	flex-grow: 1;
	}
	#book-3 input:nth-of-type(3){
	margin-left:10px;
	flex-grow: 1;
	}
	#book-3 input:nth-of-type(4){
	margin-left:10px;
	flex-grow: 1;
	}
	
	#book-4 input{
	flex-grow: 1;
	}
	
	
</style>
<body>
	<%@ include file="/WEB-INF/views/nav.jsp"%>
	<section class="main">
		<div class="title">
			<h1>도서 내용 입력</h1>
		</div>
		<form class="join" method="POST">
			<div id="book-1">
				<input id="isbn" name="isbn" placeholder="ISBN"> 
				<input id="title" name="title" placeholder="도서명">
			</div>
			<div id="book-2">
				<input name="author" placeholder="저자"> 
				<input name="publisher" placeholder="출판사"> 
				<input name="pubdate" placeholder="출판일"> 
			</div>
			
			<div id="book-3">
				<input name="price" placeholder="가격"> 
				<input name="discount" placeholder="할인가">
				<input name="link" placeholder="경로"> 
				<input name="image" placeholder="이미지">
			</div>
			<div id="book-4">
				<input name="description" placeholder="내용">
			</div>
			<div id="btn">
				<button class="join" type="button">저장</button>
				<button class="join" type="reset">새로고침</button>
				<a  href="${rootPath}/books/list">리스트보기</a>
			</div>
		</form>
	</section>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>