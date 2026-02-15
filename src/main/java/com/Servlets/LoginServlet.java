package com.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.dao.UserDao;
import com.model.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User(email,password);
		
		UserDao userDao = new UserDao();
		boolean isValied = userDao.validateUser(user); // calling saveUser() from UserDao class to signup user
		
		if(isValied) {
			HttpSession session = request.getSession();
			String name = user.getEmail().split("@")[0];
			session.setAttribute("email", name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees"); // Re-directing to EmployeesServlet
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
			requestDispatcher.forward(request, response);
		}
		
	}

}
