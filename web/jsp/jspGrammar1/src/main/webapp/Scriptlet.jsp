<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  지시부 -->
<%@ page import="java.util.Calendar ,java.util.Date"  %>
<%@ page import="java.sql.*" %>
<%!  // 선언
	int j = 100;
	public int calc(int num1, int num2 ,String opt ){
		int result = 0;
		if(opt.equals("+")){
			result = num1 + num2;
		}else if(opt.equals("-")){
			result = num1 - num2;
		}else if(opt.equals("*")){
			result = num1 * num2;
		}else{
			result = num1 / num2;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% // sctiptlet
	for(int i = 1; i <= 10 ; i++){
		out.print(i + "<br />");
	}
	for(int gop = 1; gop <= 9 ; gop++){
		out.print("5 * " + gop + " = " + 5 * gop + "<br />");
	}
%>
<hr />
<% for(int gop = 1; gop <= 9; gop++){ %>
<%	out.print("7 * " + gop + " = " + 5 * gop + "<br />"); %>
<%	} %>
<hr />
<% for (int gop = 1; gop <= 9 ; gop++){ %>
	<!-- 표현식 -->
	<%= "9 * " + gop + " = " + 9 * gop + "<br />" %>
<% } %>

<table border =1>
<% for(int tr=1 ; tr<=9 ; tr++){
		out.print("<tr>");
		for(int td=1; td <= 9 ; td++){
%>
			 <%= "<td>" + td + "</td>" %>
<% 		}
		out.print("</tr>");
	}
%>
</table>
<% 
	int sum = 0;
	for( int i = 1; i <= 100 ; i ++){
		sum += i;
	}
%>
1+2+3+4+...+100 = <%= sum %><br />
<%	sum = 0;
	for(int i = 1; i <= 100; i++){
		if(i < 100) out.print(i + "+");
		else out.print("100");
		if(i % 30 == 0) out.print("<br />");
		sum += i;
	}
%>
= <%= sum %> <br />

<%= calc(3, 5, "+") %><br />
<%
	Calendar cal = Calendar.getInstance();
%>
<%= "오늘 날짜는" + cal.getTime() %>
</body>
</html>




