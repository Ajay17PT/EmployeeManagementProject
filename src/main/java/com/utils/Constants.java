package com.utils;

public class Constants {

	public static final String URL = "jdbc:mysql://mysql:3306/Servlet_Jsp";
	
	public static final String USERNAME = "root";
	
	public static final String PASSWORD = "Naveen@sql24";
	
	public static final	String SIGN_UP = "INSERT INTO users VALUES (?,?)";
	
	public static final	String SELECT_QUERY = "SELECT * FROM users WHERE email = ?";
	
	public static final	String GET_ALL_EMP = "SELECT * FROM employees";
	
	public static final String INSERT_ALL = "INSERT INTO employees (name, age, email, phone_number, salary) VALUES(?,?,?,?,?)";
	
	public static final String DELETE_EMP = "DELETE FROM employees WHERE empId = ?";

	public static final String GET_EMP = "SELECT * FROM employees WHERE empId = ?";
	
	public static final String UPDATE_EMP = "UPDATE  employees SET name=?, age=?, email=?, phone_number=?, salary=? WHERE empId=?";
}
