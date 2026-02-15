<%@ page import="com.dao.EmployeeDao, com.model.Employee" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link rel="stylesheet" href="updateEmp.css">
</head>
<body>
<%
		 int id =Integer.parseInt(request.getParameter("id"));
		 EmployeeDao empDao = new EmployeeDao();
		 Employee emp = empDao.getEmployee(id);
%>
<h2>Update the existing employee details from below.....</h2>
<form action="update" method ="post">
	
	<label for = "id"></label>
	<input type="hidden" name = "id" value = "<%= emp.getEmpId()%>" > </br></br>
	
	<label for = "empId">EmpId : </label>
	<input type="number" name = "empId" value = "<%= emp.getEmpId()%>" disabled=true> </br></br>
	
	<label for = "name">Name : </label>
	<input type="text" name = "name" value = "<%= emp.getName()%>"> </br></br>
	
	<label for = "age">Age : </label>
	<input type="number" name = "age" value = "<%= emp.getAge()%>"> </br></br>
	
	<label for = "email">Email : </label>
	<input type="email" name = "email" value = "<%= emp.getEmail()%>"> </br></br>
	
	<label for = "phone">Phone : </label>
	<input type="text" name = "phone" value = "<%= emp.getPhoneNum()%>"> </br></br>
	
	<label for = "salary">salary : </label>
	<input type = "number" name = "salary" value = "<%= emp.getSalary()%>"></br></br>
	
	<input type="submit" value = "update">
</form>

</body>
</html>