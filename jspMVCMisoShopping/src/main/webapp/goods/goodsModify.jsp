<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsModify.jsp</title>
</head>
<body>
<form action="goodsModify.goods" method="post" >
<table border=1 align="center" width="600">
	<caption> 상품 상세보기</caption>
	<tr><th width="150" >상품번호</th>
		<td><input type="text" name="goodsNum" value="${dto.goodsNum }" readonly="readonly"></td></tr>
	<tr><th width="150" >상품명</th>
		<td><input type="text" name="goodsName" value="${dto.goodsName }"></td></tr>
	<tr><th>상품가격</th>
		<td><input type="text" name="goodsPrice" value="${dto.goodsPrice }"></td></tr>
	<tr><th>상품설명</th>
		<td><textarea rows="10" cols="45" name="goodsContent">${dto.goodsContent }</textarea></td></tr>
	<tr><th>조회수</th>
		<td><input type="text" name="visitCount" value="${dto.visitCount }" readonly="readonly"></td></tr>
	<tr><th>등록한 사원</th>
		<td><input type="text" name="empNum" value="${dto.empNum }" readonly="readonly"></td></tr>
	<tr><th>등록일</th>
		<td><input type="text" name="goodsRegist" value="${dto.goodsRegist }" readonly="readonly"></td></tr>
	<tr><th>마지막 수정 사원</th>
		<td><input type="text" name="updateEmpNum" value="${dto.updateEmpNum }" readonly="readonly"></td></tr>
	<tr><th>마지막 수정일</th>
		<td><input type="text" name="goodsUpdateDate" value="${dto.goodsUpdateDate }" readonly="readonly"></td></tr>
	<tr><th colspan="2">
		<input type="submit" value="수정완료" />
		<button type="button" onclick="">수정취소</button> 
		<button type="button" onclick="">상품목록</button></th></tr>
</table>
</form>
</body>
</html>