<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Read</title>
</head>
<body>
	<h2>Spring User Create, Read, Update and Delete</h2>
	${msg}<br/>
	<p><strong>User List is Here | <a href="create.jsp">Click for Create</a></strong></p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Course</th>
			<th>Phone-Number</th>
			<th>Action</th>
		</tr>
		<c:forEach var="user" items="${listUser}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.course}</td>
				<td><a href="./update/<c:out value='${user.id}'/>">Update</a> | <a
					href="./delete/<c:out value='${user.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>