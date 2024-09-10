<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이제 쇼핑몰을 시작하겠습니다.<br />
<ul >
	<li><a href="memberList.mem">회원 목록</a></li>
	<li><a href="employeeList.emp">직원 목록</a></li>
</ul>

<table border="1" align="center">
	<tr><td colspan="2">로그인유지 | 아이디저장 </td></tr>
	<tr><td>
			<input type="text" name="userId"  placeholder="아이디"  />
		</td>
		<td rowspan="2">
			<input type="submit" value="로그인" />
		</td></tr>
	<tr><td>
			<input type="password" name="userPw" placeholder="비밀번호"/>
		</td></tr>
	<tr><td colspan="2">
			아이디 / 비밀번호 찾기 | 
			<a href="userAgree.nhn">회원가입</a>
		</td></tr>
</table>
</body>
</html>


