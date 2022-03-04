<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Sessions</title>
</head>
<body>
<%
	if(request.getParameter("error")!=null){
		out.print("your session has expired");
	}
%>
<form action="login.jsp" method="port">
	Name:<input type="text" name="name" maxlength="50">
	Password: <input type="password" name="pass" maxlength="20">
	<input type="submit" value="login">

</form>
</body>
</html>