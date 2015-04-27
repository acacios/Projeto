<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
 <style>

a {margin-right: 20px}


body {background : "blue"}
</style>

</head>

<body>
<%-- <%

String nome = request.getParameter("nome");
out.println("nome:" + nome + "<br>");	
String local = request.getParameter("local");
 out.println("LOCAL:" + local + "<br>");	
 String origem = request.getParameter("origem");
 out.println("ORIGEM:" + origem + "<br>");	
 String destino = request.getParameter("destino");
 out.println("DESTINO:" + destino + "<br>");	
 
 
 String b = request.getParameter("b");

 out.println("Passageiro é maior que 13 anos?"+ "<br>" + b + "<br>");	

%>  --%>
<br>

<a href ="IncluirDados.jsp">Alterar os Dados</a>


<a href ="excluir.jsp">Excluir os Dados</a>


<a href ="IncluirDados.jsp">Realizar Nova Pesquisa</a>

<a href ="viagem.jsp">Confirma Passagem </a>

</body>
</html>