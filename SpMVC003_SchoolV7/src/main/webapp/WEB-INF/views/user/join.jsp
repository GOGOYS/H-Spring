<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form.join{
		width: 60%;
		margin:20px auto;
	}
	
	form.join feildset{
		border: 1px solid green;
	}
	
	form div{
		display:flex;
		margin:5px auto;
	}
	
	form input{
		flex:1;
		padding: 8px;
	}
	
	.warn{
		color:red;
		font-weight: 900;
		text-decoration: underline;
	}
	
	.ok{
		color:blue;
	}
	
	button{
		margin-left:10px;
	}

	button:not(:nth-of-type(1)){
		margin-left:10px;
	}
</style>
<script>
	//js 파일에서 rootPath를 사용할 수 있도록 미리 JS 변수로 선언
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/join.js?ver=2022-05-27-004"></script>
</head>
<body>
	<form class="join" autocomplete="off" method="POST">
		<fieldset>
			<legend>회원가입</legend>
			<div>
				<input name="username" placeholder="USER NAME" autocomplete="none"/>
				<button class="id-check" type="button">중복 검사</button>
			</div>
			<div class="username"></div>
			<div>
				<input name="password" type="password" autocomplete="none"/>
			</div>
			<div>
				<input name="re_password" type="password" autocomplete="none"/>
			</div>
			<div>
				<input name="name" placeholder="이름"/>
			</div>
			<div>
				<input name="email" placeholder="이메일"/>
			</div>
			<div>
				<button class="join" type="button">회원가입</button>
				<button type="reset">새로작성</button>
			</div>
		</fieldset>
	</form>

</body>
</html>