<html>
<head>
<title>User Registration</title>
</head>
<body>
	<h2>Spring User Create, Read, Update and Delete</h2>
<form action="create" method="post">
<pre>
    <strong>Create Here | <a href="./read">Click for Read</a></strong>
		
	Name: <input type="text" name="name" />
	
	Email: <input type="text" name="email" />
	
	Course: <input type="text" name="course" />

	Phone-Number: <input type="text" name="number"/>

	<input type="submit" value="Create" />
</pre>
</form>
${msg}
</body>
</html>