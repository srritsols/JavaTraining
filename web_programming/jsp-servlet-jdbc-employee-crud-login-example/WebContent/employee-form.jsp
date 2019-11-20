<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Employee Application</title>
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
		<c:if test="${employee != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${employee == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" style ="padding:7px">
            <caption>
            	<h2>
            		<c:if test="${employee != null}">
            			Edit Employee
            		</c:if>
            		<c:if test="${employee == null}">
            			Add New Employee
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${employee != null}">
        			<input type="hidden" name="id" value="<c:out value='${employee.id}' />" />
        		</c:if>            
            <tr>
                <th>Employee FirstName: </th>
                <td>
                	<input type="text" name="firstname" size="45"
                			value="<c:out value='${employee.firstname}' />"
                		/>
                </td>
            </tr>
             <tr>
                <th>Employee LastName: </th>
                <td>
                	<input type="text" name="lastname" size="45"
                			value="<c:out value='${employee.lastname}' />"
                	/>
                </td>
            </tr>
             <tr>
                <th>Contact No.: </th>
                <td>
                	<input type="number" name="contact" size="10"
                			value="<c:out value='${employee.number}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Employee Email: </th>
                <td>
                	<input type="text" name="email" size="45"
                			value="<c:out value='${employee.email}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Department: </th>
                <td>
                	<input type="text" name="country" size="45"
                			value="<c:out value='${employee.department}' />"
                	/>
                </td>
            </tr>
             <tr>
                <th>Date of Joining: </th>
                <td>
                	<input type="date" name="date" size="45"
                			value="<c:out value='${employee.date}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>
    