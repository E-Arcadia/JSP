<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESPOSTA</title>
</head>
<body>
	<h1>Página de resposta</h1>
	<h2>Recebendo e Mostrando os Atributos</h2>
	<%
		String Nome = (String) request.getAttribute("Nome");
		String Idade = (String) request.getAttribute("Idade");
	%>

	<p>
		Nome recebido:<%=Nome%><br>
		Idade:<%=Idade%>
	</p>
</body>
</html>