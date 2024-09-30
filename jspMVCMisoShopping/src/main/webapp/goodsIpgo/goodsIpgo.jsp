<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsIpgo.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<!-- 팦업창 -->
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		window.open("goodsItem.ipgo","상품검색"
				,"width=620,height=500,left=30, top=500" );
	});
});
</script>
</head>
<body>
<a href="<c:url value='/' />">홈</a>
<ul>
	<li><a href="goodsWrite.goods">상품 추가</a></li>
	<li><a href="goodsIpgo.ipgo">상품 입고</a></li>
	<li><a href="goodsIpgoList.ipgo">상품 입고 현황</a></li>
	<li><a href="goodsList.goods">상품목록</a></li>
</ul>
 상품입고 <br />
 <form action="ipgoRegist.ipgo" method="get ">
 입고번호 :  <input type="text" name= "goodsIpgoNum" /><br />
 상품번호 :  <input type="text" name= "goodsNum" id="goodsNum"/>
 			 <button type="button" id="btn" >상품 검색</button><br />
 상품명 :  <input type="text"  id="goodsName"/><br />
 입고일 : <input type="date" name= "ipgoDate" /><br />
 입고 수량 : <input type="number" name= "ipgoQty" /><br />
 제조일 : <input type="datetime-local" name= "madeDate" /><br />
 가격 :  <input type="number" name= "ipgoPrice" /><br />
 <input type="submit" value="입고 등록" />
 </form>
</body>
</html>