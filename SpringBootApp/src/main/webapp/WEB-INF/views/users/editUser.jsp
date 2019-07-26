<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="/users/editUser">
		<h3>name</h3>
		<input type="text" name="name">
		<h3>description</h3>
		<textarea name="desc"></textarea>
		<button type="submit">ok</button>
	</form>

</body>
</html>