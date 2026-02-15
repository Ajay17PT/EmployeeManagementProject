package com.Servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.dao.UserDao;
import com.model.User;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User(email,password);
		
		UserDao userDao = new UserDao();
		userDao.saveUser(user); // calling saveUser() from UserDao class to signup user
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
			
		
	}

}
