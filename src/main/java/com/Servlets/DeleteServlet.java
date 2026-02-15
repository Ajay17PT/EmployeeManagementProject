package com.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.EmployeeDao;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empId = Integer.parseInt(request.getParameter("id"));
		
		
		EmployeeDao empDao = new EmployeeDao();
		empDao.deleteEmployee(empId);
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
//		requestDispatcher.forward(request, response);
		
		response.sendRedirect("employees");//Another way of redirecting when we are not sending any values
		
		// Note: Use "RequestDispatcher" when sending the values.
	}

}

/* <a> tag request type is GET method only So the 405 error :  HTTP method GET is not supported by this URL is comes

If "employees" is another servlet that has only doPost()
➡ then forward will call GET there
➡ and again 405 will come.

So check that servlet too.

Finally we need to add a doGet method over there and call the doPost method*/