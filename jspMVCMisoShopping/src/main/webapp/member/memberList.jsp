<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberList.jsp</title>
</head>
<body>
회원 리스트<br />
<a href="memberWrite.mem">회원등록</a><br />
회원수 : ${list.size() }<br />
<table border=1 width="600">
	<tr><td>번호</td><td>이름</td><td>아이디</td><td>등록일</td></tr>
	<c:forEach items="${list }" var="dto">
	<tr><td><a href="memberDetail.mem?memberNum=${dto.memberNum }">${dto.memberNum }</a></td>
		<td><a href="memberDetail.mem?memberNum=${dto.memberNum }">${dto.memberName }</a></td>
		<td>${dto.memberId }</td>
		<td>${dto.memberRegist }</td></tr>
	</c:forEach>
</table>

</body>
</html>