<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsIpgoList.jsp</title>
</head>
<body>
<a href="<c:url value='/' />">홈</a>
<ul>
	<li><a href="goodsWrite.goods">상품 추가</a></li>
	<li><a href="goodsIpgo.ipgo">상품 입고</a></li>
	<li><a href="goodsIpgoList.ipgo">상품 입고 현황</a></li>
	<li><a href="goodsList.goods">상품목록</a></li>
</ul>
<table border=1 width="600" align="center">
	<caption>입고현황</caption>
	<tr><td>번호</td><td>입고번호</td><td>상품번호</td><td>상품가격</td><td>수량</td><th>입고일</th></tr>
</table>
</body>
</html>