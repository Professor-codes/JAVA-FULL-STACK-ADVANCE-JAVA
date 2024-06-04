<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Odd Even Input</h1>

	<form action="OddEvenServlet" method="post">
		Number : <input type="text" name="num" />
		${numError} <br>
		<br> <input type="submit" value="Process" />
	</form>
</body>
</html>