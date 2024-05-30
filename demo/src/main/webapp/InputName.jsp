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
	String nameError = (String) request.getAttribute("nameError"); // null
	%>

	<form action="NameServlet" method="post">
		<input type="text" name="name" /> <span style="color: red"> <%=nameError == null ? "" : nameError%>
		</span> <br> <br> <input type="submit" value="submit" />
	</form>
</body>
</html>