<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findIdOk.jsp</title>
</head>
<body>
크기 : ${fn:length(userId) } <br />
substring : ${fn:substring(userId,0 ,2) } <br />
나머지 글자크기 : ${fn:length(userId) - 4 }<br />
wrwe...<br />

<c:if test="${! empty userId }">
당신의 아이디는 ${fn:substring(userId,0 ,4) }
<c:forEach begin="1" end="${fn:length(userId) - 4 }" step="1">
.
</c:forEach>
</c:if>
<c:if test="${empty userId }">
	입력하신 정보가 정확하지 않습니다.
</c:if>
</body>
</html>





