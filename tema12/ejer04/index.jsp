<%-- 
    Document   : index
    Created on : 13-feb-2020, 9:46:18
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Media de 3 notas</h1>
    <form action="media.jsp" method="get">
      Nota1: <input type="number" min="0" max="10" step="0.01" name="nota1"><br>
      Nota2: <input type="number" min="0" max="10" step="0.01" name="nota2"><br>
      Nota3: <input type="number" min="0" max="10" step="0.01" name="nota3"><br><br>
      <input type="submit" value="Media">
    </form>
  </body>
</html>
