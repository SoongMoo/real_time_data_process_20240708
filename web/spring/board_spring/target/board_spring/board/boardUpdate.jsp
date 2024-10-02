<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardUpdate.jsp</title>
</head>
<body>
<form action="boardModify.miso" method="post">
번호 : <input type="text" name = "boardNum" value="${dto.boardNum }" readonly="readonly"/><br />
이름 : <input type="text" name = "boardWriter" value="${dto.boardWriter }"/><br />
제목 : <input type="text" name = "boardSubject" value="${dto.boardSubject }"/><br />
내용 : <textarea rows="10" cols="50" name="boardContent">${dto.boardContent }</textarea><br />
<input  type="submit" value="수정완료"> 
</form>
</body>
</html>



