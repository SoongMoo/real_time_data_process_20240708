<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li><a href="memberMyPage.my">내정보 보기</a></li>
	<li><a href="memberUpdate.my">내정보 수정</a></li>
	<li><a href="userPwModify.my">비밀번호변경</a></li>
	<li>회원탈퇴</li>
</ul>
<form action="memberPwPro.my" method="post" id="frm">
현재비밀번호:<input type="password" name="oldPw" id="oldPW" required="required" /><br />
새 비밀번호:<input type="password" name="newPw" id="newPw" required="required" /><br />
새 비밀번호 확인:<input type="password" name="newPwCon" id="newPwCon" required="required" /><br />
<input type="submit" value="비밀번호 변경" />
</form>
</body>
</html>