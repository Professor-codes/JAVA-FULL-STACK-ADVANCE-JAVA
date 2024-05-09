<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>JSP DEMO</h1>

<% 
	int a = 10;
	int b = 10;
	int c = a + b;
%>
<br>
Anser : 
<%=
	c
%>
<br>
<%=a%> + <%=b%> = <%=c%>

</body>
</html>