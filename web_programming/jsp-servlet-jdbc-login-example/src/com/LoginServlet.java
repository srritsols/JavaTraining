package com;

import java.io.IOException; 

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

import com.srritsols.bean.Login;
import com.srritsols.dao.LoginDAO; 

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginDAO loginDao;

	public void init() {
		loginDao = new LoginDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username : " + username + ", password: "+ password);

		Login loginBean = new Login();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		try {
			if (loginDao.validate(loginBean)) { 
				response.sendRedirect("loginsuccess.jsp");
			} else { 
				response.sendRedirect("./login.jsp");
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
