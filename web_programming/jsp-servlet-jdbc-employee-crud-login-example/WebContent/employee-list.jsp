<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h1 style="color:green"><b>Employment Form</b></h1>
        <h2>
        	<a href="new"><i>Add New Employee</i></a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list"><i>List All Employee</i></a>
        	
        </h2>
	</div>
	 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Employee List</h2></caption>
            <tr>
                <th>EmployeeId</th>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Contact</th>
                <th>Email</th>
                <th>Department</th>
                <th>Date</th>
                <th>Actions</th>
            </tr>
             <c:forEach var="employee" items="${listEmployee}">
                <tr>
                    <td><c:out value="${employee.id}" /></td>
                    <td><c:out value="${employee.firstname}" /></td>
                    <td><c:out value="${employee.lastname}" /></td>
                    <td><c:out value="${employee.number}" /></td>
                    <td><c:out value="${employee.email}" /></td>
                    <td><c:out value="${employee.department}" /></td>
                    <td><c:out value="${employee.date}" /></td>
                    <td>
                    	<a href="edit?id=<c:out value='${employee.id}' />">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp;
                    	<a href="delete?id=<c:out value='${employee.id}' />">Delete</a>                    	
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>