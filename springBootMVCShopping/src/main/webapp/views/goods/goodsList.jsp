<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsList.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
function goodsItem(goodsNum, goodsName){
	// 매개변수의 값을 부모창에 보내야 한다. $(opener.document).find()
	$(opener.document).find("#goodsNum").val(goodsNum);
	$(opener.document).find("#goodsName").val(goodsName);
	//var name= $(opener.document).find().val();
	window.self.close();
}
</script>
</head>
<body>
<c:if test="${empty vw }">
	<ul>
		<li><a href="goodsWrite.goods">상품 추가</a></li>
		<li><a href="goodsIpgo.ipgo">상품 입고</a></li>
		<li><a href="goodsIpgoList.ipgo">상품 입고 현황</a></li>
	</ul>
</c:if>
<table border=1 width="600" align="center">
	<caption>상품 목록</caption>
	<tr><th>번호</th><th>상품번호</th><th>상품명</th><th>상품가격</th></tr>
	<c:forEach items="${list }" var="dto" varStatus="idx"> 
	<tr><th>${idx.count }</th>
	<c:if test="${empty vw }">
		<th><a href="goodsDetail.goods?goodsNum=${dto.goodsNum }">${dto.goodsNum }</a></th>
	</c:if>
	<c:if test="${!empty vw }">
		<th><a href="javascript:goodsItem('${dto.goodsNum }','${dto.goodsName }')">${dto.goodsNum }</a></th>
	</c:if>
		<th>${dto.goodsName }</th>
		<th>${dto.goodsPrice }</th></tr>
	</c:forEach>
</table>
</body>
</html>


