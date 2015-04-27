<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="controle.*, dominio.*"%>
<jsp:useBean class="dominio.ManterVoo" id="ManterVoo" scope="request"></jsp:useBean>

<html>
<head>
 
  <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
  <meta http-equiv="Pragma" content="no-cache">
  <meta http-equiv="Expires" content="Mon, 06 Jan 1990 00:00:01 GMT">
  <meta http-equiv="Cache-Control" content="no-store">
  <meta http-equiv="Expires" content="-1">
  <style>

a {margin-right: 20px}
body {background : "blue"}
body {background-image: url("imagem/Avião.jpeg")}
</style>
</head>
<body background = "blue" >
<p>Ponha seu nome, idade, o local onde se encontra, origem de sua partida e o destino qual deseja ir.:</p>
    
  <form name="incluirDados" method="post" action="exibir.jsp">
	<table border="1" cellspacing="0" cellpadding="2">
	 
	 <tr>
	    
	     <th>Nome:</th>
	     <td><input type="text" name="nome" value="<%= request.getAttribute("nome") %>" maxlength="50"></td>
	     	     	     
	  </tr>
	    
	 <tr>
	     <th>Local:</th>
	     <td><input type="text" name="local" value="<%= request.getAttribute("local") %>" maxlength="20"></td>
	  </tr>
	  <tr>
	      <th>Origem:</th>
	     <td><input type="text" name="origem" value="<%= request.getAttribute("origem") %>" maxlength="50"></td>
	  </tr>
	  <tr>
	    	     
	     <th>Destino:</th>
	     <td><input type="text" name="destino" value="<%= request.getAttribute("destino") %>" maxlength="50"></td>
	     
	     
	     
	  </tr>
	    
	  	  
	</table>
	<br>
	
<p>O passageiro é maior de 13 anos?</p>
<input type="radio" name="b" value="Sim"> Sim
<br>
<input type="radio" name="b" value="Não"> Não
<br><br>
	<input type="submit" name="Confirmar" value="Confirmar">
	
  </form>
  
  
  </body>
</html>