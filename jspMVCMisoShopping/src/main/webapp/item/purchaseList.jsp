<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="800" align="center">
	<tr><td>주문번호 / 결제번호</td><td> 상품명 </td><td> 주문상태 </td></tr>
	<c:forEach items="${list }" var="dto">	
	<tr><td>${dto.purchaseNum } / 결제대기중</td>
	    <td> ${dto.goodsName } </td>
	    <td> ${dto.purchaseStatus } </td></tr>
	</c:forEach>
</table>
</body>
</html>