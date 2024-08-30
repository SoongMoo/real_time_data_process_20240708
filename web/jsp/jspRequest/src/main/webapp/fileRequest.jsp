<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest, 
				 com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
				 java.io.File" %>
<%
/*
String userName = request.getParameter("userName");
String upFile1 = request.getParameter("upFile1");
*/
	String savePoint = request.getRealPath("/upload");
	System.out.println(savePoint);
	int sizeLimit = 5 * 1024 * 1024 ; // 5M
	MultipartRequest multi = new MultipartRequest(
			request, savePoint ,sizeLimit,  "utf-8",
			new DefaultFileRenamePolicy());
	String userName = multi.getParameter("userName");
	String fileName1 = multi.getFilesystemName("upFile1");
	String orgFileName1 = multi.getOriginalFileName("upFile1");
	File file = multi.getFile("upFile1");
	long fileSize = file.length();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%= userName %><br />
시스템 파일명 : <%= fileName1 %><br />
원본 파일명 : <%= orgFileName1 %><br />
파일크기 : <%= fileSize %><br />
<img src = "upload/<%=fileName1 %>" />
<hr />
시스템 파일명 : <%= multi.getFilesystemName("upFile2") %><br />
원본 파일명 : <%= multi.getOriginalFileName("upFile2") %><br />
파일크기 : <% file = multi.getFile("upFile2"); %><br />
		 <%= file.length() %>

<hr />
시스템 파일명 : <%= multi.getFilesystemName("upFile3") %><br />
원본 파일명 : <%= multi.getOriginalFileName("upFile3") %><br />
파일크기 : <% file = multi.getFile("upFile3"); %><br />
		 <%= file.length() %>


</body>
</html>