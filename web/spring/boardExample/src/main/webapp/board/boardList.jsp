<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList.jsp</title>
</head>
<body>
게시글 목록<br />
<a href="boardWrite">게시글 쓰기</a><br />
<table border = "1" width=600>
	<tr><td>번호</td><td>작성자</td><td>제목</td></tr>
	<c:forEach items="${list }" var="dto">
	<tr><td><a href="boardDetail?boardNum=${dto.boardNum }">${dto.boardNum }</a></td>
		<td>${dto.boardWriter }</td>
		<td><a href="boardDetail?boardNum=${dto.boardNum }">${dto.boardSubject }</a></td></tr>
	</c:forEach>
</table>
</body>
</html>

