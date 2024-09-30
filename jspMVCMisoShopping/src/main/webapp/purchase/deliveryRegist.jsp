<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="deliveryWrite.deli" method="post">
<table width="600" align="center">
	<caption>배송정보 등록</caption>
	<tr><td>주문번호</td>
		<td><input type="text"  name="purchaseNum" readonly="readonly" 
			value="${purchaseNum }"/></td>
	</tr>
	<tr><td>송장번호</td>
		<td><input type="text"  name="deliveryNum" required="required" 
			value="${deliveryNum }" /></td>
	</tr>
	<tr><td colspan="2"><input type="submit" value="송장번호등록" /></td></tr>
</form>
</table>
</body>
</html>