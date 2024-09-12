<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberForm.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/checkScript.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src ="js/daumAddressScript.js"></script>
</head>
<body>
회원등록 페이지입니다.<br />
<form action="memberRegist.mem" method="post">
회원번호 : <input type="text" name="memberNum" value="${memberNum }" readonly="readonly"/>자동부여<br />
회원아이디 : <input type="text" name="memberId" id="userId"/><br />
회원비밀번호 : <input type="password" name="memberPw" /><br />
회원비밀번호확인 : <input type="password" name="memberPwCon" /><br />
회원명 : <input type="text" name="memberName" /><br />
회원주소 : <input type="text" name="memberAddr" id="sample4_roadAddress"/>
		<button type="button" onclick="execDaumPostcode();"  >우편번호검색</button><br />
상세주소 : <input type="text" name="memberAddrDetail" /><br />
우편번호 : <input type="text" name="memberPost" id="sample4_postcode" /><br />
회원연락처1 : <input type="tel" name="memberPhone1" /><br />
회원연락처2 : <input type="tel" name="memberPhone2" /><br />
회원성별 : <input type="radio" name="gender" value="M" checked="checked"/>남자
		<input type="radio" name="gender" value="F"/>여자<br />
회원생년월일 : <input type="date" name="memberBirth" /><br />
회원이메일 : <input type="email" name="memberEmail" /><br />
<input type="submit" value="회원등록" />
</form>
</body>
</html>



