package com;

import java.io.IOException;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myuser.bean.EmployeeLogin;
import com.myuser.dao.EmployeeLoginDao;


/**
 * Servlet implementation class UserLoginServlet
 */ 
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeLoginDao employeeLoginDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginServlet() {
       employeeLoginDao = new EmployeeLoginDao();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		System.out.println("username :" + username +",password : "+password );
		
		EmployeeLogin loginBean = new EmployeeLogin();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		
		try {
			if(employeeLoginDao.validate(loginBean)) {
				response.sendRedirect("employeeloginsucess.jsp");
			} else {
				response.sendRedirect("./employeelogin.jsp");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
