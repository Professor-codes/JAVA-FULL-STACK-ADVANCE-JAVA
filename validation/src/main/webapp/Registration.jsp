<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">

		<div class="row">

			<div class="col-md-3"></div>

			<div class="col-md-6">

				<h2>Registration</h2>

				<%
				String firstNameError = (String) request.getAttribute("firstNameError");
				String genderError = (String) request.getAttribute("genderError");
				String cityError = (String) request.getAttribute("cityError");
				%>

				<form action="RegistrationServlet" method="post">
					First Name : 
					<input type="text" name="firstName" class="form-control" /> 
					<span
						style="color: red"> <%=firstNameError == null ? "" : firstNameError%>
					</span> 
					<br> 
					<br> 
					Gender : Male<input type="radio" name="gender" value="male"> 
							 Female<input type="radio" name="gender" value="female"> 
						<span style="color: red"> 
							<%=genderError == null ? "" : genderError%>
						</span> 
						<br> 
						<br> 
						City : <select name="city" class="form-control">
									<option value="-1">Select city</option>
									<option value="ahm">Ahmedabad</option>
									<option value="gnr">Gandhinagar</option>
									<option value="mbi">Mumbai</option>
						</select> 
					    <span style="color: red"> 
							<%=cityError == null ? "" : cityError%>
						</span> 
						<br> 
						<br> 
						<input type="submit" value="Register" class="btn btn-primary"/>
						<input type="button" value="Cancel" class="btn btn-danger"/>
				</form>

			</div>

		</div>

		<div class="col-md-3"></div>

	</div>


</body>
</html>