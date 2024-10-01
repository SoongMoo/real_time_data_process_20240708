<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>descript.jsp</title>
</head>
<body>
	<table width="800" align="center">
	<tr><td>
		${fn:replace(dto.goodsContent , newLine, '<br />') }<br />
		<c:forTokens items="${dto.goodsDetailStoreImage }" delims="`" var="img" >
			<img src="goods/upload/${img }" /><br />
		</c:forTokens>
	</td></tr>
	</table>
</body>
</html>