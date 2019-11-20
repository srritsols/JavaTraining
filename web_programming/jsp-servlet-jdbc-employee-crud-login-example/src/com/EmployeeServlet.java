package com;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myuser.bean.Employee;
import com.myuser.dao.EmployeeDao;



/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init() {
        employeeDao =new EmployeeDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertEmployee(request, response);
				break;
			case "/delete":
				deleteEmployee(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateEmployee(request, response);
				break;
			default:
				listEmployee(request, response);
				break;
			}
		}
		catch(SQLException e1) {
			throw new ServletException (e1);
		}
				
			}
	
	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		List<Employee> listEmployee = employeeDao.selectAllEmployee();
		request.setAttribute("listEmployee", listEmployee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee-list.jsp");
		dispatcher.forward(request, response);
	}
		

	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int contact = Integer.parseInt(request.getParameter("contact"));
		String email = request.getParameter("email");
		String department  = request.getParameter("department");
		String date = request.getParameter("date");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//Date hiredate = sdf.parse(date);
		Employee emp = new Employee(employeeId, firstName,lastName, contact,email, department, date);
		employeeDao.updateEmployee(emp);
		response.sendRedirect("list");
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		// TODO Auto-generated method stub
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		Employee existingEmployee = employeeDao.selectEmployee(employeeId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee-form.jsp");
		request.setAttribute("employee", existingEmployee);
		dispatcher.forward(request, response);
		
	}

	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method 
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		employeeDao.deleteEmployee(employeeId);
		response.sendRedirect("list");
		
	}

	private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int contact = Integer.parseInt(request.getParameter("contact"));
		String email = request.getParameter("email");
		String department  = request.getParameter("department");
		String date = request.getParameter("date");
		Employee newEmployee = new Employee(firstName, lastName,contact, email, department,date);
		employeeDao.insertEmployee(newEmployee);
		response.sendRedirect("list");
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee-form.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
