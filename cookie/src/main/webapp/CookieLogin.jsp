<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cookie Login</h1>

	<form action="CookieServlet" method="post">
		Username : <input type="text" name="username"> <br>
		<br> Password : <input type="password" name="password" /> <br>
		<br> <input type="submit" value="Login" />
	</form>
</body>
</html>