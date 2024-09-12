<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userForm.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src ="js/daumAddressScript.js"></script>
<script type="text/javascript" src="js/checkScript.js"></script>
<script type="text/javascript" >
$(function(){
	$("#frm").submit(function(){
		if($("#memberPw").val() != $("#memberPwCon").val()){
			alert("비밀번호와 비밀번호확인이 다릅니다.");
			$("#memberPw").val("");
			$("#memberPwCon").val("");
			$("#memberPw").focus();
			return false;
		}
	});
	
});
</script>
</head>
<body>
<form action="userRegist.nhn" method="post" id="frm">
<table width="600" align="center" border=1>
	<caption>회원 가입 페이지</caption>
	<tr><td>*아이디</td>
		<td>
			<input type="text" name="memberId" id="userId" required="required" readonly /> 아이디 중복확인
		</td></tr>
	<tr><td>*비밀번호</td>
		<td>
			<input type="password" name="memberPw" id="memberPw" required="required" />
		</td></tr>
	<tr><td>*비밀번호확인</td>
		<td>
			<input type="password" name="memberPwCon" id="memberPwCon" required="required" />
		</td></tr>
	<tr><td colspan="2">회원기본정보</td></tr>
	<tr><td>*회원이름</td>
		<td>
			<input type="text" name="memberName" required="required" />
		</td></tr>
	<tr><td>*회원 연락처1</td>
		<td>
			<input type="tel" name="memberPhone1" required="required" />
		</td></tr>
	<tr><td>회원 연락처2</td>
		<td>
			<input type="tel" name="memberPhone2" />
		</td></tr>
	<tr><td>*회원주소</td>
		<td>
			<input type="text" name="memberAddr" id="sample4_roadAddress" required="required" 
			 readonly />
			<button type="button" onclick="execDaumPostcode();"  >우편번호검색</button>
		</td></tr>
	<tr><td>회원상세주소</td>
		<td>
			<input type="text" name="memberAddrDetail"  />
		</td></tr>
	<tr><td>*회원우편번호</td>
		<td>
			<input type="text" name="memberPost" id="sample4_postcode" required="required" readonly />
		</td></tr>
	<tr><td>*회원이메일</td>
		<td>
			<input type="email" name="memberEmail" required="required" readOnly/>
		</td></tr>
	<tr><td>*회원생년월일</td>
		<td>
			<input type="date" name="memberBirth" required="required" />
		</td></tr>
	<tr><td>*성별</td>
		<td>
			<input type="radio" name="memberGender" value="M" checked="checked" />남자
			<input type="radio" name="memberGender" value="F"  />여자
		</td></tr>
	<tr><td colspan="2">
			<input type="submit" value="회원가입" />
			<input type="button" value="회원가입 취소" onclick="javascript:location.href='/jspMVCShopping'" />
		</td></tr>
</table>
</form>
</body>
</html>