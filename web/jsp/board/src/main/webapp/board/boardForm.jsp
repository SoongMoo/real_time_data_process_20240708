<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	location.href=""
</script>
</head>
<body>
게시글 쓰기<br />
<form  action="boardWrite.nhn" method="post">
<table border=1>
	<tr><td>글쓴이</td>
		<td><input type="text" name="boardWriter"/></td></tr>
	<tr><td>제목</td>
		<td><input type="text" name="boardSubject" /></td></tr>
	<tr><td>내용</td>
		<td><textarea rows="5" cols="60" name="boardContent"></textarea></td></tr>
	<tr><td colspan="2"><input type="submit" value="게시글 저장" /></td></tr>
</table>
</form>
</body>
</html>