<%-- 
    Document   : index
    Created on : 03-mar-2020, 9:15:53
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="css/estilos.css">
  </head>
  <body>
      
    <h1>Apuesta y gana</h1>
    
    <div id="principal">
    
    <form method="get" action="juego.jsp">
      <p>Introduzca la cantidad que quiera apostar:</p>
      <input type="number" name="dinero" min="1">€<br>
      <input type="submit" value="Aceptar">
    </form>
    
    </div>
    
  </body>
</html>
