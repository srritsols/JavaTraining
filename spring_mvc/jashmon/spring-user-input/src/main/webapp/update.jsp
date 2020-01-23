<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>Spring User Create, Read, Update and Delete</h2>
	<p><strong>Update Here | <a href="./read">Click for Read</a></strong></p>
<form action="../update" method="post">
<pre>
<c:forEach var="user" items="${listUser}">
		
Id:    	<input type="text" name="dispId" value="${user.id}" disabled="disabled"/>
		<input type="hidden" name="id" value="${user.id}"/>
Name:  	<input type="text" name="name" value="${user.name}" />
		
Email: 	<input type="text" name="email" value="${user.email}" />
	    
Course:	<input type="text" name="course" value="${user.course}" />

Phone-Number:  <input type="text" name="number" value="${user.number}" />
		    
        <input type="submit" value="Update" />	
</c:forEach>	
</pre>
</form>
${msg}
</body>
</html>