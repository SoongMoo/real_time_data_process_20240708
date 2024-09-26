<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>item/goodsOrder.jsp</title>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src ="js/daumAddressScript.js"></script>
</head>
<body>
<table width="700" align="center">
	<tr><td>상품 대표 이미지</td><td>주문 상품 정보</td><td>수량/상품금액</td><td>금액</td></tr>
				
</table>
<form action="goodsOrder.item" method="post">
<input type="hidden" name="purchaseName" value="개"/>
<input type="hidden" name="goodsNums" value=""/>
<input type="hidden" name="totalPaymentPrice" value="" />
<table width="700"  align="center">
	<tr><td>
			<table width="350">
				<tr><td colspan=2>2. 배송 정보</td></tr>
				<tr><td>받는 사람 </td>
					<td><input type="text" name="deliveryName" /></td></tr>
				<tr><td>받는 사람 주소 </td>
					<td><input type="text" name="deliveryAddr" id="sample4_roadAddress"
						onclick="execDaumPostcode();" readonly="readonly" /></td></tr>
				<tr><td>받는 사람 상세 주소 </td>
					<td><input type="text" name="deliveryAddrDetail" /></td></tr>
				<tr><td>받는 사람 우편번호 </td>
					<td><input type="text" name="deliveryPost" readonly="readonly" 
						id="sample4_postcode"/></td></tr>
				<tr><td>받는 사람 연락처 </td>
					<td><input type="tel" name="deliveryPhone" /></td></tr>
				<tr><td>배송 메세지 </td>
					<td><input type="text" name="message" /></td></tr>
			</table>
		</td>
		<td>
			<table width="350">
			
				<tr><td colspan=2 align="center">3. 결제정보</td></tr>
				<tr><td> 총 금액 </td><td align="right">원</td></tr>
				<tr><td> 총 배송비</td><td align="right">원</td></tr>
				<tr><td> 총 결제 금액 </td>
					<td align="right">원 </td></tr>
				<tr><td align="center"  colspan=2><input type="submit" value="구매하기"/></td></tr>
			</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>