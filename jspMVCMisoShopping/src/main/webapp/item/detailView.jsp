<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detailView.jsp</title>
</head>
<body>
<table width="800" align="center">
<caption>청바지 상품정보입니다.</caption>
<tr><td rowspan="5"><img src="" height="200" /></td>
					<td></td></tr>
<tr>                <td></td></tr>
<tr>                <td>무료배송	1000원</td></tr>
<tr>                <td>수량 : <input type="number" min="1" step="1" value="1" id="cartQty"/> </td></tr>
<tr>                <td><button type="button" id="cartBtn">장바구니</button> | 
 						<button type="button" id="buyItem">바로구매 </button> | 
						<img src="images/hart1.jpg" width="20" id="wish"/>
						<img src="images/hart.jpg" width="20" id="wish"/>
					찜</td></tr>
<tr><td colspan="2">
		<span id="descript">제품 상세 설명</span> | 
		<span id="review">리뷰</span> | 
		<span id="inquire" onclick="">상품문의</span>
	</td></tr>
<tr><td colspan="2"><div id="content"></div></td></tr>
</table>
</body>
</html>