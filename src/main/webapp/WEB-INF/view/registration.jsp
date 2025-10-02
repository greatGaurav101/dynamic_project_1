<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register here..</h1>
	<form action="reg" method="post">
		Name :<input type="text" name="name" /> <input type="submit" />

	</form>
	<%
	if(request.getAttribute("session")!= null){
		   out.println(request.getAttribute("session")); //out & request are implicit object
		}
	
	%>


</body>
</html>