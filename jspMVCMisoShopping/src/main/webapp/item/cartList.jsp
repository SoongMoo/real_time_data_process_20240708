<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cartList.jsp</title>
</head>
<body>
<table width="600" align = "center">
	<tr><td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td></tr>
	<c:forEach items="${list }" var="dto" varStatus="idx">
		<tr><td><img src="goods/upload/${dto.goodsImage }" width="30"/></td>
		<td>${dto.goodsName }</td>
		<td><a href="#">[ - ]</a> 
			${dto.cartQty } 
			<a href="#">[ + ]</a></td>
		<td>${dto.totalPrice }</td></tr>
	</c:forEach>
</table>
</body>
</html>