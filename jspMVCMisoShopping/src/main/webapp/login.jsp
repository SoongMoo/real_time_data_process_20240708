<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login1.login" method="post" >
<table border="1" align="center">
	<tr><td colspan="2">
			 자동로그인 | 아이디저장
		</td></tr>
	<tr><td>
			<input type="text" name="userId"  placeholder="아이디" />
			<div style="color:red">${errId }</div>
		</td>
		<td rowspan="2">
			<input type="submit" value="로그인" />
		</td></tr>
	<tr><td><input type="password" name="userPw" placeholder="비밀번호"/>
			<div style="color:red">${errPw }</div>
		</td></tr>
	<tr><td colspan="2">
			<a href="idInquiry.help">아이디</a> / 
			<a href="pwInquiry.help">비밀번호 찾기</a> | 
			<a href="userAgree.nhn">회원가입</a>
		</td></tr>
</table>
</form>
</body>
</html>