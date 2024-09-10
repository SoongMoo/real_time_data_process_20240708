<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify.jsp</title>
</head>
<body>
회원수정 페이지입니다.<br />
<form action="memberModify.mem" method="post" >
회원번호 : <input typ="text" value="${dto.memberNum }" name="memberNum"> <br />
이름 : <input type="text" name="memberName" value="${dto.memberName }"/><br />
아이디 : <input type="text" name="memberId" value="${dto.memberId }"/><br />
주소 : <input type="text" name="memberAddr" value="${dto.memberAddr }" /><br />
상세주소 : <input type="text" name="memberAddrDetail" value="${dto.memberAddrDetail }"/><br />
우편번호 : <input type="text" name="memberPost" value="${dto.memberPost }"/><br />
연락처1 : <input type="tel" name="memberPhone1" value="${dto.memberPhone1 }"/><br />
연락처2 : <input type="tel" name="memberPhone2" value="${dto.memberPhone2 }"/><br />
성별 : <input type="radio" name="gender" value="M" 
		<c:if test="${dto.gender == 'M' }">checked</c:if> />남자
	  <input type="radio" name="gender" value="F" 
	  	<c:if test="${dto.gender == 'F' }">checked</c:if>  />여자	<br />
등록일 : <input type="date" name="memberRegist" value="${dto.memberRegist }"/><br />
생년월일 : <input type="date" name="memberBirth" value="${dto.memberBirth }"/><br />
이메일 : <input type="email" name="memberEmail" value="${dto.memberEmail }"/><br />
<input type="submit" value="회원수정 완료" /> 
</form>
</body>
</html>




