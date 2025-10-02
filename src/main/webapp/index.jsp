<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login here...</h2>
	<form action="login" method="post">

		<pre>
		 Email : <input type="text" name="email" />
		 Password : <input type="pwd" name="password" />
		 <input type="submit" />
	 </pre>

	</form>

	<%
	if(request.getAttribute("error msg")!= null){
	   out.println(request.getAttribute("error msg")); //out & request are implicit object
	}
	%>

</body>
</html>