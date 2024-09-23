<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myPwCon.jsp</title>
</head>
<body>
	<ul>
	<li><a href="<c:url value='/' />">홈</a></li>
	<c:if test="${auth.grade == 'emp' }">
		<li><a href="empMyPage.my">내정보 보기</a></li>
		<li><a href="empUpdate.my">내정보 수정</a></li>
		<li><a href="userPwModify.my">비밀번호변경</a></li>
	</c:if>
	<c:if test="${auth.grade == 'mem' }">
		<li><a href="memberMyPage.my">내정보 보기</a></li>
		<li><a href="memberUpdate.my">내정보 수정</a></li>
		<li><a href="userPwModify.my">비밀번호변경</a></li>
		<li><a href="memberDrop.my">회원탈퇴</a></li>
	</c:if>
	</ul>
<form  action="userPwUpdate.my" method="post">
비밀번호 확인 : <input type="password" name="memberPw" required="required"/>
			<div style="color:red">${errPw }</div>
			<input type="submit" value="확인"/>
</form>
</body>
</html>