<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
	

		<div>
			<label for="email">Email</label>
			<input type="email" name="email">
		</div>
		
		<div>
			<label for="password">Password</label>
			<input type="password" name="password">
		</div>

		<div>
			<input type="submit" value="Login">
		</div>
	</form>
	<a href="register.jsp">Register</a>
	<h6>${msg}</h6>
</body>
</html>