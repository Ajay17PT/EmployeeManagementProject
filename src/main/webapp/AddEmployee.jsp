<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link rel="stylesheet" href="AddEmp.css">
</head>
<body>
<h2>Add The Employee by filling the required Details  below...</h2>

<form action="addemp" method ="post">
	
	<label for = "name">Name : </label>
	<input type="text" name = "name" placeholder="Enter your Name" required> </br></br>
	
	<label for = "age">Age : </label>
	<input type="number" name = "age" placeholder="Enter your Age" required> </br></br>
	
	<label for = "email">Email : </label>
	<input type="email" name = "email" placeholder="Enter your Email" required> </br></br>
	
	<label for = "phone">Phone : </label>
	<input type="text" name = "phone" placeholder="Enter your phone number" required> </br></br>
	
	<label for = "salary">salary : </label>
	<input type = "number" name = "salary" placeholder="Enter your salary" required></br></br>
	
	<input type="submit" value = "Add Employee">
</form>
</body>
</html>