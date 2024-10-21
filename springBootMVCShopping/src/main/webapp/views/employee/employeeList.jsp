<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
직원목록페이지입니다.<br />
<table border =1 width=600>
	<tr><td>직원번호</td><td>직원명</td><td>입사일</td></tr>
	<c:forEach items="${dtos}" var="dto">
	<!-- 상세페이지로 이동 -->
	<tr><td><a href="employeeDetail.emp?num=${dto.empNum }">${dto.empNum }</a></td>
		<td><a href="employeeDetail.emp?num=${dto.empNum }">${dto.empName }</a></td>
		<td>${dto.empHireDate }</td></tr>
	</c:forEach>
</table>
<a href="employeeJoin.emp" >직원등록</a>
</body>
</html>