<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstName = (String)request.getAttribute("firstNameValue");
		String gender = (String)request.getAttribute("genderValue");
		String city = (String)request.getAttribute("cityValue");
	%>
	<h2>First name : <%=firstName %></h2>
	<h2>Gender     : <%=gender %></h2>
	<h2>City       : <%=city %></h2>
</body>
</html>