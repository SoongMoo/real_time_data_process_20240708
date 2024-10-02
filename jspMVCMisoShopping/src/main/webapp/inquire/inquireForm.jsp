<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="inquireWritePro.inq" >
<input type="hidden" name="goodsNum" value="${goodsNum }"/>
<table width="600" align="center" border=1>
	<tr><td ><select name="queryType">
				<option value="상품" >상품(성능/사이즈) </option>
				<option>배송</option>
				<option>교환</option>
				<option>반품/취소/환불</option>
				<option>기타</option>
			</select></td>
		<td align="right"><input type="submit"  id="btnInsert" value="문의하기" /></td>
	</tr>
	<tr><th>제목</th>
		<td><input type="text" name="inquireSubject" /></td>
	</tr>
	<tr><th>내용</th>
		<td><textarea cols="50" rows="10" name="inquireContent"></textarea></td>
	</tr>	
</table>
</form>
</body>
</html>