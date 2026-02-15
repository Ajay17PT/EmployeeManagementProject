<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>
<h3>SignUp with your Credentials!</h3>
<form action="signup" method ="post">

	<label for = "email">Email : </label>
	<input type="email" name = "email" placeholder="Enter your Email" required> </br></br>
	
	<label for = "password">password : </label>
	<input type = "text" name = "password" placeholder="Enter your password" required></br></br>
	
	<input type="submit" value = "Sign Up">

	<p> Already a Register User?  <a href="index.html">Login Page</a> </p>
</form>
</body>
</html>