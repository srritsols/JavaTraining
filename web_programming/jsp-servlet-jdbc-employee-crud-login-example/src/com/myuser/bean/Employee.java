package com.myuser.bean;

import java.sql.Date;

public class Employee {  
	protected String firstName;
	protected String lastName;
	protected int contact;
	protected String email;
	protected String department;
	protected Date date;

	public Employee() {
		
	}
	public Employee(String firstName, String lastName, int contact,String email,String department, Date date) {
	 
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email= email;
		this.department = department;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", email="
				+ email + ", department=" + department + ", date=" + date + "]";
	}
	
	
}
