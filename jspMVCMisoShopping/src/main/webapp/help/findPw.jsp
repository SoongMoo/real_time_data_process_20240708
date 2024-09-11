<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
비밀번호 찾기<br />
<form action="findPwOk.help" method="post" >
<table border="1" width="600" align="center">
	<tr><td>아이디</td>
		<td><input type="text" name="userId" required="required"/></td></tr>
	<tr><td>전화번호</td>
		<td><input type="text" name="userPhone" required="required"/>
			<input type="submit" value="비밀번호 찾기"/>
			</td></tr>
</table>
</form>
</body>
</html>