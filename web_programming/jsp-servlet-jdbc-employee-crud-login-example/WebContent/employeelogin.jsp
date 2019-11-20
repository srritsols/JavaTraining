<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
</head>
<body>
   <div align="center">
   <h1 style="color:blue">Employee Login</h1>
     <form action="<%=request.getContextPath()%>/employeeLogin" method="post">
       <table style="with: 100%">
         <tr>
            <td>UserName</td>
            <td><input type="text" name="username" /></td>
         </tr>
         <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
         </tr>
        </table>
        <input type="submit" name="Submit" />
      </form>
       
    </div>

</body>
</html>