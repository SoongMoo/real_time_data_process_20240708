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
<c:if test="${!empty userId }">
당신의 아이디는 ${fn:substring(userId,0,4) }
<c:forEach begin="1" end="${fn:length(userId) - 4 }" step="1">
<!-- 아이디의 앞 4자리만 출력하고 나머지는 점으로 출력 -->
.
</c:forEach>
입니다.
</c:if> 
<c:if test="${empty userId }">
 입력한 정보에 해당하는 아이디가 존재하지 않습니다.
</c:if>
<p>
<a href="<c:url value='/'/>">홈</a>
</p>
<!-- 
<c:forEach begin="0" end="10">
1
</c:forEach>
<%
	for(int i = 0 ; i < 10 ; i++){
		out.print("1");
	}
%>
--->











</body>
</html>