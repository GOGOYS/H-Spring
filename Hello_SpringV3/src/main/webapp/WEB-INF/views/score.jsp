<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- form태그에 method='POST'를 하면 정보가 주소창에 공개되지 않고 전송된다. -->
	<form method='POST'>
		<div>
			<input name='st_name' placeholder="이름">
		</div>
		<div>
			<input name='int_kor' placeholder="국어">
		</div>
		<div>
			<input name='int_eng' placeholder="영어">
		</div>
		<div>
			<input name='int_math' placeholder="수학">
		</div>
		<div>
		<button>서버로 보내기</button></div>
	</form>
	<div>
		<p>이름 :${SCORE.st_name }</p>
		<p>국어 :${SCORE.int_kor }</p>
		<p>영어 :${SCORE.int_eng }</p>
		<p>수학 :${SCORE.int_math }</p>
	</div>

</body>
</html>