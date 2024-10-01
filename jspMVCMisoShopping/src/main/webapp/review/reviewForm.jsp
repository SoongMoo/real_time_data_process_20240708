<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
리뷰등록<br />
<form action="reviewWrite.review" method="post">
<input type="hidden" name="purchaseNum" value=${purchaseNum } /><br />
<input type="hidden" name="goodsNum" value=${goodsNum } /><br />

후기 내용 : <textarea rows="5" cols="50" name="reviewContent">${dto.reviewContent }</textarea>
<input type="submit" value="후기 등록" />
</form>
</body>
</html>