<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<style>
	table{
		width:95%;
		margin:10px auto;
		border: 1px solid green;
	}
	
	th, td{
		text-align:left;		
	}
	div.btn-box{
		width:95%;
		margin:5px auto;
		text-align: right;
	}
	
	button{
		background-color: blue;
		color: white;
		border: none;
		outline: none;
		padding: 12px 16px;
		border-radius: 5px;
	}
</style>
<table>
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>학과</th>
		<th>학년</th>
		<th>전화번호</th>
	</tr>
</table>
<script src="${rootPath}/static/js/list.js?ver=2022-05-09-003"></script>
<div class="btn-box">
	<button class="btn-red std-input">학생정보 등록</button>
</div>