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
	<!-- 추가 -->
	<tr><td colspan="6" align="right">
			상품수 : <span id="prodCnt">0</span>개<br />
			총수량 : <span id="totQty">0</span>개<br />
			전체 합계 : <span id="totalPrice">0</span>원
		</td>
	</tr>
	<tr><td colspan="6" align="right">구매하기</td></tr>
</table>
</body>
</html>