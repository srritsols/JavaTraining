<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Read</title>
</head>
<body>
	<h2>Spring MVC User Registration</h2>
	${msg}<br/>
	<p><strong>User List | <a href="create.jsp">Click for Create</a></strong></p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="user" items="${listUser}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td><a href="./update/<c:out value='${user.id}'/>">Update</a> | <a
					href="./delete/<c:out value='${user.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>