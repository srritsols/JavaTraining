package com.myuser.bean;



public class Employee {
	protected int employeeId;
	protected String firstName;
	protected String lastName;
	protected int contact;
	protected String email;
	protected String department;
	protected String date;

	public Employee() {
		
	}
	public Employee(String firstName, String lastName, int contact,String email,String department, String date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email= email;
		this.department = department;
		this.date = date;
	}
	
	public Employee(int employeeId,String firstName, String lastName, int contact,String email,String department, String date) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email= email;
		this.department = department;
		this.date = date;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
