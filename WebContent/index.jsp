<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Minha primeira JSP</title>
</head>
<body>
<h1>P�gina inicial</h1>
<h2>Prencha os Dados</h2>
<form action="principal" method="get">
		Nome:<br> 
		<input type="text" name="nome"><br> 
		Idade:<br> 
		<input type="text" name="idade"><br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>