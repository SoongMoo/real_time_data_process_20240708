<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="inquireRepleUpdate.inq" method="post">
<table width="600" border="1">
<tr><th>문의 번호</th>
	<td><input type="text" value="${dto.inquireNum }" name="inquireNum" readonly="readonly" /></td></tr>
<tr><th>질문자</th><td>${dto.memberNum }</td></tr>
<tr><th>문의 제목</th><td>${dto.inquireSubject }</td></tr>
<tr><th>문의 등록일</th><td>${dto.inquireDate }</td></tr>
<tr><th>문의 내용</th>
	<td>${fn:replace(dto.inquireContent,newLine, '<br />') }</td>
</tr>
<tr><th>답변한 사람</th><td>${dto.empNum }</td></tr>
<tr><th>답변일</th><td>${dto.inquireAnswerDate }</td></tr>
<tr><th>문의 답변</th>
	<td><textarea rows="10" cols="50" name="inquireAnswer" >${dto.inquireAnswer }</textarea></td>
</tr>
<tr><th colspan="2"><input type="submit" value="답변달기" /></th></tr>
</table>
</form>

</body>
</html>


