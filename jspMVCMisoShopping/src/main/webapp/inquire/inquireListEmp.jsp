<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inquireListEmp.jsp</title>
<script type="text/javascript">
function goodsDetail(goodsNum){
	window.open('goodsDetail.goods?goodsNum='+goodsNum, '상품정보', 
			"width=800,height=700,left=100,top=100");
}
</script>
</head>
<body>
<table width="600" border=1 align="center" >
	<tr><th>번호</th><th>문의제목</th><th>제품번호</th></tr>
	<c:forEach items="${list }" var="dto" varStatus="idx">
	<tr><th>${idx.count }</th>
		<th><a href="inquireAnswer.inq?inquireNum=${dto.inquireNum }">
					${dto.inquireKind} : ${dto.inquireSubject }</a></th>
		<th><a href="javascript:goodsDetail('${dto.goodsNum }');">${dto.goodsNum }</a></th></tr>
	</c:forEach>
</table>
</body>
</html>