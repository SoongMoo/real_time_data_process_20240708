<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1 align="center" width="600">
	<caption>${dto.goodsName } 상품 상세보기</caption>
	<tr><th width="150" >상품번호</th><td>상품번호</td></tr>
	<tr><th width="150" >상품명</th><td>상품명</td></tr>
	<tr><th>상품가격</th><td>상품가격</td></tr>
	<tr><th>배송비</th><td>배송비</td></tr>
	<tr><th>상품설명</th><td>상품설명</td></tr>
	<tr><th>조회수</th><td>조회수</td></tr>
	<tr><th>등록한 사원</th><td>등록한 사원</td></tr>
	<tr><th>등록일</th><td>등록일</td></tr>
	<tr><th>마지막 수정 사원</th><td>마지막 수정 사원</td></tr>
	<tr><th>마지막 수정일</th><td>마지막 수정일</td></tr>
	<tr><th colspan="2">
		<a href="goodsUpdate.goods">상품수정</a> | 
		<a href="goodsDelete.goods">상품 삭제</a> | 
		<a href="goodsList.goods">상품목록</a></th></tr>
</table>
</body>
</html>