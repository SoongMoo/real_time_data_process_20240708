<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#inquire1").click(function(){
		window.open("inquireWrite.inq?goodsNum=${goodsNum}","문의하기"
				,"width=700, height=650, top=100, left=100");
	});
});
</script>
</head>
<body>
<table width="800" align="center" border="1">
	<tr><td colspan="3" align="right">
			<button type="button" id="inquire1" >문의 하기</button></td></tr>
	<tr><th width="15%">답변 상태</th><th>작성자</th><th>질문일자</th></tr>
	
	<tr><th width="15%">답변 상태</th><th>작성자</th><th>질문일자</th></tr>
	<tr><td colspan="3">질문</td></tr>
	<tr><td>답변</td><td colspan="2">답변 내용</td><</tr>
</table>
</body>
</html>



